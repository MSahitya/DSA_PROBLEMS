package org.example.Arrays;

public class RemoveDuplicatesFromSortedArr {
    public static void main(String[] args) {
     new Solution11().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
    }
}
class Solution11 {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int i=0;
        while( i <nums.length-1){
            if(nums[i]!=nums[i+1]){
                count++;
            }i++;
        }
  System.out.println(i+"\t"+count);

        return count;
    }
}