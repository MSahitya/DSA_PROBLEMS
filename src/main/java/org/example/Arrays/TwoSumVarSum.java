package org.example.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumVarSum {
    public static void main(String[] args) {
    Solution sol=new Solution();
    System.out.println(Arrays.toString(sol.twoSum(new int[]{3,2,4},6)));

    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices=new int[2];

        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i],i );
        }
       // System.out.println(map);
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
           // System.out.println("x="+x+"\t"+map.get(x));
            if(map.containsKey(x) && i != map.get(x)) {
                indices[0] = i;
                indices[1] = (int) map.get(x);
                break;
            }
        }

        return indices;
    }
}