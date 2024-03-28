package org.example.Arrays;

public class Sort0sand1s {
    public static void main(String[] args) {
        Solution4.sortZeroesAndOne(new int[]{0,1, 1, 0, 1, 0, 1});
    }
}
class Solution4 {

    public static void sortZeroesAndOne(int[] arr) {
        int left=0, right=arr.length-1;
        while(left<right){
            //System.out.println("left="+left+"\tright="+right);
            if(arr[left]==0 && arr[right]==1 ){
                left++;
                right--;
            }
            else if(arr[left]==0 && arr[right]!=1){
                left++;
            }
            else if(arr[left]!=0 && arr[right]==1){
                right--;
            }
            else  {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }

        }
    }
}
