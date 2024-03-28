package org.example.Arrays;

import java.util.Arrays;

public class PrefixSumforAgivenRange {
    public static void main(String[] args) {
        int arr[]={6,3,-2,4,-1,0,-5};

        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        //Find sum of [3,4] arr[i,j]=arr[j]-arr[i-1]
        int i=3,j=4;
        int sum=arr[j]-arr[i-1];
        System.out.print(Arrays.toString(arr)+"\t"+sum);
    }
}
