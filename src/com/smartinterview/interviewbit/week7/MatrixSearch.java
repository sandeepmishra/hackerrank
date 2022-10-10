package com.smartinterview.interviewbit.week7;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.interviewbit.com/problems/matrix-search/
 */
public class MatrixSearch {
    public static void main(String[] args) {

    }

    // solution checking 1st and last element in row and then doing binary search if in range
    public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {

        for(int i=0;i<A.size();i++){
            //System.out.println(i);
            List<Integer> list = A.get(i);
            if(list.get(0)==B){
                return 1;
            }else if(list.get(list.size()-1)==B){
                return 1;
            } else if((list.get(0) <= B) && (list.get(list.size()-1)>= B )){
                //System.out.println(i+ "inner value");
                for(int j=1;j<list.size()-1;j++){
                    if(list.get(j)==B){
                        return 1;
                    }
                }
            }

        }
        return 0;
    }

    // N+M traversing from top right to bottom eliminating the row and column
    // traverse to column till element is not found if element < B then change the row to down
    public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B, int size) {

        return 0;
    }

}
