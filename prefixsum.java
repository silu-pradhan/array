package array;
import java.util.*;
public class prefixsum {
    public static void main(String[] args) {
        int arr[]={1,7,4,29,4};
        int n=arr.length;
        prefix(arr,n);
    }
    public static void prefix(int arr[],int n){
//        calculate the sum
        int prefix[]=new int [n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int currsum=0;
        int max=Integer.MIN_VALUE; 
//        calculate the highest sum of the element
        for(int i=0;i<n;i++){
            int start=i;
            for(int j=0;j<n;j++){
                int end=j;
                currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
            }
            if(currsum>max){
                max=currsum;
            }
        }
        System.out.println(max);
    }
}
