package org.example.Arrays;

public class CheckArrayRotation {
    public static void main(String[] args) {

    }
}
class Solution8 {

    public static int arrayRotateCheck(int[] arr){
        int n=arr.length;
        int ele=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                continue;
            }
            else{
                ele=i+1;
                break;
            }
        }
        return ele;
    }

}
