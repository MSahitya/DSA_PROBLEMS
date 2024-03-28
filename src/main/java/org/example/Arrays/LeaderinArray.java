package org.example.Arrays;

public class LeaderinArray {
    public static void main(String[] args) {
        int arr[]={15,18,4,5,6,2,3}; //Elements should be greates than all elements on its right
        int maxFromRight = arr[arr.length - 1];
        System.out.println(maxFromRight);
        for(int i=arr.length-2 ;i>=0;i--){
           if(arr[i]>maxFromRight) {
               maxFromRight=arr[i];
               System.out.println(maxFromRight);

           }
        }

    }
}
