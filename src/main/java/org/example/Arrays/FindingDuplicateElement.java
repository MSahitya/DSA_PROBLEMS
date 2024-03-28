package org.example.Arrays;

public class FindingDuplicateElement {
}
//O(N^2)
  class Solution2{

    public static int duplicateNumber(int arr[]) {
        int n=arr.length;


        for(int i=0;i<n;i++) {

            for(int j=0;j<n;j++) {
                if(i!=j && arr[i]==arr[j]) {
                    return arr[i];

                }
            }

        }
        return -1 ;
    }
}
