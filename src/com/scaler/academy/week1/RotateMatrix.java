package com.scaler.academy.week1;


// input     [
//         [1, 2],
//         [3, 4]
//         ]

//output  [
//        [3, 1],
//        [4, 2]
//        ]
public class RotateMatrix {

    public static void main(String[] args) {
        int arr [][] = new int[3][3];
        int output [][] = new int[3][3];
        int count =1;
        System.out.println("Matrix after rotation..");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=count++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("matrix after rotation..");

        for(int i=0;i<arr.length;i++){
            int index=arr.length-1;
            for(int j=0;j<arr.length;j++){
                output[i][j]=arr[index--][i];
            }
        }

        System.out.println("print rotated array..");
        for(int i=0;i<output.length;i++){
            for(int j=0;j<output.length;j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}
