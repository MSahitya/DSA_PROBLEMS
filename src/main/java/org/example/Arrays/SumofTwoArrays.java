package org.example.Arrays;

public class SumofTwoArrays {
}
class Solution10 {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int m=arr1.length;
        int n=arr2.length;
        int i=m-1;
        int j=n-1;

        int carry=0;
        int size=m>n?m:n;
        int k=size;
        //System.out.println("k="+k);
        // output=new int[size+1];
        // System.out.println("i="+i+"\tj="+j+"\tm="+m+"\tn="+n);
        while(i>=0 && j>=0){
            int sum=arr1[i]+arr2[j]+carry;
            carry=(sum/10);
            output[k]=sum%10;
            i--;
            j--;
            k--;
            //System.out.println("sum="+sum+"\ti="+i+"\tj="+j+"\tsum="+sum+"\tcarry="+carry+"\tk="+k+"\t"+sum%10);

        }
        while(i>=0){
            int sum=arr1[i]+carry;
            carry=sum/10;
            output[k]=sum%10;
            i--;
            k--;
            //System.out.println("k="+k);
        }
        while(j>=0){
            int sum=arr2[j]+carry;
            carry=sum/10;
            output[k]=sum%10;
            j--;
            k--;
            // System.out.println("k="+k);
        }
        if(carry>0){
            // System.out.println("k="+k);
            output[k]=carry;
        }
        //System.out.println(Arrays.toString(output));
    }

}
