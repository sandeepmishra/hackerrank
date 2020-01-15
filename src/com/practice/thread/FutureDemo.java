package com.practice.thread;

import java.util.concurrent.*;

public class FutureDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long startTime=System.currentTimeMillis();
        new AreaCalculator().calculateSquareArea(10);
        new AreaCalculator().calculateRectangleArea(10,10);
        System.out.println("Time taken for area calculation without thread is: "+(System.currentTimeMillis()-startTime));

        startTime=System.currentTimeMillis();
        ExecutorService squareExecutor= Executors.newSingleThreadExecutor();
        Future<Integer> squareFuture =squareExecutor.submit(new CallablSquareAreaCalculator(10));
        ExecutorService rectangleExecutor= Executors.newSingleThreadExecutor();
        Future<Integer> rectangleFuture=rectangleExecutor.submit(new CallableRectangleAreaCalculator(10, 10));
        //System.out.println(squareFuture.get());
        //System.out.println(rectangleFuture.get());
        System.out.println("Total time take using Future is: "+(System.currentTimeMillis()-startTime));



        // can be achieved as below


    }

    Future<Integer> calculateRectangleArea(int lenght, int bredth){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        return executorService.submit(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return new AreaCalculator().calculateRectangleArea(lenght, bredth);
        });
    }

    

}

class CallablSquareAreaCalculator implements Callable<Integer>{

    int squareSize;
    CallablSquareAreaCalculator(int squareSize){
        this.squareSize=squareSize;
    }

    @Override
    public Integer call() throws Exception {
        return new AreaCalculator().calculateSquareArea(squareSize);
    }
}

class CallableRectangleAreaCalculator implements Callable<Integer>{
    int lenght, bredth;

    CallableRectangleAreaCalculator(int lenght, int bredth){
        this.lenght=lenght;
        this.bredth=bredth;
    }

    @Override
    public Integer call() throws Exception {
        return new AreaCalculator().calculateRectangleArea(lenght, bredth);
    }

}

class AreaCalculator {
    public int calculateSquareArea(int side) throws InterruptedException {
       Thread.sleep(10000);
       return side*side;
    }

    public int calculateRectangleArea(int length, int bredth) throws InterruptedException {
        Thread.sleep(10000);
        return length*bredth;
    }
}
