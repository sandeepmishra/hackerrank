package com.smartinterview.hackerrank.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/contests/smart-interviews/challenges/si-diagonal-traversal-of-matrix
 */
public class DiagonalTraversalMatrix {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//
//        for(int i=0;i<t;i++) {
//            int n = Integer.parseInt(br.readLine());
//            String [][] input = new String[n][n];
//            for(int j=0;j<n;j++){
//                input[j] = br.readLine().split(" ");
//            }
//
//
//            for(int j=n-1;j>=0;j--){
//                int sum =0;
//                int ct =0;
//                for(int k=j;k<=n-1;k++){
//                    sum+=Integer.parseInt(input[ct][k]);
//                    ct++;
//                }
//                System.out.print(sum+ " ");
//            }
//
//            for(int j=1;j<n;j++){
//                int sum =0;
//                int ct =0;
//                for(int k=j;k<=n-1;k++){
//                    sum+=Integer.parseInt(input[k][ct]);
//                    ct++;
//                }
//                System.out.print(sum+" ");
//            }
//
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
//       int  A  [][] =
//               {
//                       ,
//        {9, 10, 10, 12, 12, 13, 14, 21, 21},
//            {23, 26, 26, 29, 29, 31, 32, 35, 37},
//                {38, 39, 39, 39, 41, 41, 42, 42, 43},
//                    {45, 45, 46, 46, 46, 47, 48, 48, 51},
//                       {51, 51, 54, 54, 54, 54, 56, 58, 59},
//                       {60, 61, 61, 62, 63, 64, 65, 66, 67},
//                       {67, 67, 70, 70, 71, 73, 73, 73, 74},
//                       {74, 79, 79, 80, 82, 84, 84, 84, 87},
//                       {89, 93, 94, 94, 97, 98, 98, 98, 98}
//};
       int B = 64;

       List<List<Integer>> liA = new ArrayList<>();
       int arr[] = {1, 1, 2, 2, 5, 6, 6, 6, 7};
       List<Integer> li = new ArrayList(Arrays.asList(arr));
       liA.add(li);

        int arr2[] =  {23, 26, 26, 29, 29, 31, 32, 35, 37};
        li = new ArrayList(Arrays.asList(arr2));
        liA.add(li);

        int arr3[] =  {38, 39, 39, 39, 41, 41, 42, 42, 43};
        li = new ArrayList(Arrays.asList(arr3));
        liA.add(li);

        int arr4[] =  {45, 45, 46, 46, 46, 47, 48, 48, 51};
        li = new ArrayList(Arrays.asList(arr4));
        liA.add(li);

        int arr5[] =  {51, 51, 54, 54, 54, 54, 56, 58, 59};
        li = new ArrayList(Arrays.asList(arr5));
        liA.add(li);
        int arr6[] =  {60, 61, 61, 62, 63, 64, 65, 66, 67};
        li = new ArrayList(Arrays.asList(arr6));
        liA.add(li);
        int arr7[] =  {67, 67, 70, 70, 71, 73, 73, 73, 74};
        li = new ArrayList(Arrays.asList(arr7));
        liA.add(li);
        int arr8[] =  {74, 79, 79, 80, 82, 84, 84, 84, 87};
        li = new ArrayList(Arrays.asList(arr8));
        liA.add(li);
        int arr9[] =  {89, 93, 94, 94, 97, 98, 98, 98, 98};
        li = new ArrayList(Arrays.asList(arr9));
        liA.add(li);
        System.out.println(searchMatrix(liA, B));
    }
    public static int searchMatrix(List<List<Integer>> A, int B) {

//        for(Integer i=0;i<A.size();i++){
//            List<Integer> list = A.get(i);
//            Object arr[] = list.toArray();
//            if(list.get(0)==B){
//                return 1;
//            }else if((list.get(0)<= B) && (list.get(list.size()-1)>= B )){
//                for(int j=1;j<list.size()-1;j++){
//                    if(list.get(j)==B){
//                        return 1;
//                    }
//                }
//            }
//
//        }
//        return 0;
        int n = A.size();
        int m = A.get(0).size()-1;

        for(Integer i=0;i<n+m;i++){
            int val = A.get(n).get(m);
            if(val==B){
                return 1;
            }else{
                if(val>B){

                }
            }
        }
        return 0;
    }
}


