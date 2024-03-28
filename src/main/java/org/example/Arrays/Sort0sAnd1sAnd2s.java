package org.example.Arrays;

public class Sort0sAnd1sAnd2s {
    public static void main(String[] args) {

    }
}
class Solution9 {

    public static void sort012(int[] arr){
        int n=arr.length;
        int nz=0,nt=n-1,i=0;
        while(i<=nt){
            if(arr[i]==2){
                swap(i,nt,arr);
                nt--;
            }
            else if(arr[i]!=0){
                i++;
            }else{
                swap(i,nz,arr);
                i++;
                nz++;
            }

            // System.out.println(Arrays.toString(arr));
        }

    }
    public static int[] swap(int i, int j, int[] arr){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
        return arr;

    }

}
