package org.example.Arrays;

public class PushZerosTotheEnd {
    public static void main(String[] args) {

    }
}
class Solution5 {

    public static void pushZerosAtEnd(int[] arr) {

        int n=arr.length;
        int i=0,k=0;
        while(i<n){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k++;
            }
            i++;
        }

    }
    public static int[] swap(int l,int r,int[] arr){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        return arr;

    }


}
