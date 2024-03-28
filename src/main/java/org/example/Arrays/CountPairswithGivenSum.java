package org.example.Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountPairswithGivenSum {
    public static void main(String[] args) {
        int arr[]={1,1,1,1};//o/p:6
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                count+=map.get(arr[i]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
     System.out.print(count);

    }
}
