package com.smartinterview.hackerrank.week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathInGraphBFS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String nodeEdge[] = br.readLine().split(" ");
            int N = Integer.parseInt(nodeEdge[0]);
            int M = Integer.parseInt(nodeEdge[1]);
            List<List<Integer>> lists = new ArrayList<>(N+1);
            for(int i=0;i<=N;i++){
                lists.add(i, new ArrayList<>());
            }
            for(int i=0;i<M;i++){
                String uv[] = br.readLine().split(" ");
                int u = Integer.parseInt(uv[0]);
                int v = Integer.parseInt(uv[1]);
                lists.get(u).add(v);
                lists.get(v).add(u);
            }
            //System.out.println(bfs(lists, s, d));
        }
    }

    private static int bfs(List<List<Integer>> lists, int s, int d) {
        int N = lists.size();
        int max=-1;
        int dist[] = new int[N+1];
        for(int i=0;i<=N;i++){
            dist[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        dist[s] = 0;
        while(!q.isEmpty()){
            int u = q.poll();
            List<Integer> list = lists.get(u);
            for(Integer val:list){
                if(dist[val]==-1){
                    q.offer(val);
                    dist[val] = dist[u]+1;
                }
                max = max<dist[u]?dist[u]:max;
            }
        }
        return max;
    }
}
