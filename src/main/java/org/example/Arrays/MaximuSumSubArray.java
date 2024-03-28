package org.example.Arrays;

public class MaximuSumSubArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0,11,8,3,76};//Only Positive
        int[] negArr={-2,1,-3,4,-1,2,1,-5,4};// Positive & Negative
        negArr=new int[]{-1,0};
        int currSum = negArr[0];
        int maxSum=negArr[0];
        for(int i=1;i<negArr.length;i++){
            currSum = Math.max(negArr[i],currSum+negArr[i]);
            maxSum=Math.max(currSum,maxSum);
        }

  System.out.println(maxSum);


    }
}
