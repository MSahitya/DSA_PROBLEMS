package org.example.Arrays;

public class InterSectionof2Arrays {
}
class Solution3{

    public static void intersections(int arr1[], int arr2[]) {
        int n=arr1.length;

        for(int i=0;i<n;i++) {
            for(int j=0;j<arr2.length;j++) {
                if(arr1[i]==arr2[j]) {
                    System.out.print(arr1[i]+" ");
                    arr2[j]=-1;
                    break;
                }
            }

        }

    }
}
