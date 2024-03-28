package org.example.Arrays;

public class RotateArray {
}
class Solution6 {

    public static void rotate(int[] arr, int d) {
        int n=arr.length-1;
        swap(0,n,arr);
        swap(0,n-d,arr);
        swap(n-d+1,n,arr);
        // System.out.println(Arrays.toString(arr));

    }
    public static int[] swap(int left, int right, int[] arr){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }


}
