package Questions.Array;

import java.util.Arrays;

public class RowsWithMax1 {
    public static void main(String[] args) {

        int[][] arr = {{0},{0}};//{{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};

        maxOnes(arr);


    }

    private static void maxOnes(int[][] arr) {
        int[] ones= new int[arr.length];
        for (int i = 0;i<arr.length;i++){
            int count=0;
            for (int j = 0;j<arr[i].length;j++){
                if (arr[i][j]==1){
                    count++;
                }
            }
            ones[i]= count;
        }
        int maxIndex = -1;
        int max = ones[0];
        for (int i =0;i<ones.length;i++){
            if (ones[i]>max){
                maxIndex = i;
            }
        }
        if (maxIndex>=-1){
            System.out.println(maxIndex);
        }else {
            System.out.println(-1);
        }
    }
}
//
//    You are given a 2D array consisting of only 1's and 0's, where each row is sorted in non-decreasing order.
//        You need to find and return the index of the first row that has the most number of 1s. If no such row exists, return -1.
//        Note: 0-based indexing is followed.
//
//        Examples:
//
//        Input: arr[][] = [[0, 1, 1, 1],
//        [0, 0, 1, 1],
//        [1, 1, 1, 1],
//        [0, 0, 0, 0]]
//        Output: 2
//        Explanation: Row 2 contains 4 1's.