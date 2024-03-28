package org.example.Arrays;

public class FindingTheUniqueElementintheArray {
    public static void main(String[] args) {
        Solution1.findUnique(new int[]{3,2,1,4,3,2});
    }

}
//O(n^2)
  class Solution1{

    public static int findUnique(int[] arr){
        int n=arr.length;
        int currUn=-1;
        boolean isMatchingfound=false;
        for(int i=0;i<n;i++) {
            isMatchingfound=false;
            for(int j=0;j<n;j++) {
                if(i!=j && arr[i]==arr[j]) {
                    isMatchingfound=true;
                    break;
                }
            }
            if(!isMatchingfound) {
                currUn=i;
                break;
            }
        }
        return arr[currUn];
    }
}