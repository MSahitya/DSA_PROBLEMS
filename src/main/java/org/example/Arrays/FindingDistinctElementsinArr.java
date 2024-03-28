package org.example.Arrays;

import java.util.Arrays;

public class FindingDistinctElementsinArr {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4,5,6,7,88,88};
        //First sort all elements of an Array
        Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
           while(i<arr.length-1 && arr[i]==arr[i++]){
               i++;
           }
           System.out.println(arr[i]);
        }
    }
}
