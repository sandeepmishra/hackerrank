package com.arrays;

public class TwoDArrays {
    public static void main(String[] args) {
        int arr[][] = new int[6][6];
        int count=0;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j]=count++;
            }
        }

        int max =0, sum=0, intxCnt=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        if(intxCnt!=3 && intxCnt !=5){
                            sum+=arr[k][l];
                        }
                        intxCnt++;
                    }
                }
                if(sum>max){
                    max = sum;
                }
                sum=0;
                intxCnt=0;
            }
        }
        System.out.println(max);
    }
}
