package com.practice.thread;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThroughputHttpServer {

    private static final String INPUT_FILE = "resources/fieles.txt";
    private static final int NUMBER_OF_THREADS = 1;

    public static void main(String[] args) throws IOException {
        //String text = new String(Files.readAllBytes(Paths.get(INPUT_FILE)));
        //startServer(text);


        List<String[]> listArr = new ArrayList<>();
        for(int j=0;j<3;j++){
            String [] strArr = new String[5];
            for(int i=0;i<strArr.length;i++){
                strArr[i]= i+"abc"+j;
            }
            listArr.add(strArr);
        }

        listArr.stream().forEach(e-> {
            System.out.println(e[0]);
        });
    }

    public static void startServer(String text) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/search", new WorldCounterHandler(text));
        Executor executor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
        server.setExecutor(executor);
        server.start();
    }

    private static class WorldCounterHandler implements HttpHandler{
        private String text;

        public WorldCounterHandler(String text) {
            this.text = text;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String query = exchange.getRequestURI().getQuery();
            String [] keyValue = query.split("=");
            String action = keyValue[0];
            String word = keyValue[1];
            if(!action.equals("word")){
                exchange.sendResponseHeaders(400, 0);
                return;
            }
            long count = countWord(word);
            byte [] response = Long.toString(count).getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(200, response.length);
            OutputStream outputStream = exchange.getResponseBody();
            outputStream.write(response);
            outputStream.close();
        }

        private long countWord(String word){
            long count=0;
            int index =0;
            while(index>=0){
                index = text.indexOf(word, index);
                if(index>= 0){
                    count ++;
                    index++;
                }
            }
            return count;
        }


    }


}
