package com.datastructures.arrays;

public class ArrayClone {

    public static void main(String[] args) {

        new ArrayClone().cloneObjectArray();
    }

    public void cloneObjectArray(){
        GameEntry [] arrayCloneChecks = new GameEntry[5];
        int i = 10;

        for(int j=0;j<arrayCloneChecks.length;j++){
            GameEntry gameEntry= new GameEntry();
            gameEntry.score = i+1;
            i++;
            arrayCloneChecks[j] = gameEntry;
        }

        GameEntry [] arrayCloneChecks1 = arrayCloneChecks.clone();

        arrayCloneChecks[4].score = 5;

        for(GameEntry gameEntry : arrayCloneChecks){
            System.out.println("arrayCloneChecks: "+gameEntry.score);
        }
        System.out.println("----------------------------------------------------");
        for(GameEntry gameEntry : arrayCloneChecks1){
            System.out.println("arrayCloneChecks1: "+gameEntry.score);
        }
    }

    public void clonePrimitiveArr(){
        int arr[]  = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        int arrb [] = arr.clone();
        arr[4] = 20;

        for(int i=0;i<arr.length;i++){
            System.out.println("Array 1: "+arr[i]);
            System.out.println("Array 2: "+arrb[i]);
        }
    }

}
class GameEntry{

    int score;

}


