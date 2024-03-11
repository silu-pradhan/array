package array;
import java.util.*;
public class subarraymax {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n=arr.length;
        max(arr,n);
    }
    public static void max(int arr[],int n){
        int currsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currsum=0;
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    currsum+=arr[k];

                }
                System.out.println(currsum);
                if(currsum>max){
                   max=currsum;
                }
            }
        }
        System.out.println("maximum sum is"+max);

    }
}
