package com.arrays;

public class MissingCount {

    public static void main(String[] args) {
//        int arr[] = {1,2,3,4};
//        System.out.println(findKthPositive(arr, 2));
        String word1[] = {"ab", "c"}, word2[] = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static int findKthPositive(int[] arr, int k) {

        int startCount = 0;
        int count=0;
        for( int i=0;i<arr.length;i++){
            while(arr.length-1 >= i && arr[i] > startCount){
                startCount++;
                if(startCount<arr[i]){
                    count++;
                }
                //System.out.println(count);
                if(count==k){
                    return startCount;
                }
            }
        }
        while(count<k){
            startCount++;
            count++;
        }
        return startCount;
    }


    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder();
        for(String s: word1){
            sb1 = sb1.append(s);
        }

        StringBuilder sb2 = new StringBuilder();
        for(String s: word2){
            sb2 = sb2.append(s);
        }
        System.out.println(sb1);
        System.out.println(sb2);
        return sb1.compareTo(sb2)==0;
    }

}
