package array;
import java.util.*;
public class kadans {
    public static void main(String[] args) {
        int arr[]={1,3,6,9,2};
        int n=arr.length;
        System.out.println(kadan(arr,n));
    }
    public static int kadan(int arr[],int n){
        int maxsum=Integer.MIN_VALUE;
        int countsum=0;
        for(int i=0;i<n;i++){
            countsum=countsum+arr[i];
            if(countsum>maxsum){
                maxsum=countsum;
            }
        }
        return maxsum;
    }
}
