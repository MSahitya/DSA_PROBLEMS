package org.example.Arrays;

public class SecondLargestinArray {
}
class Solution7 {

    public static int secondLargestElement(int[] arr) {
        int L=Integer.MIN_VALUE;
        int SL=Integer.MIN_VALUE;
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]>L){
                SL=L;
                L=arr[i];
            }
            else if(arr[i]>SL && arr[i]!=L){
                SL=arr[i];
            }

        }
        return SL;

    }

}
