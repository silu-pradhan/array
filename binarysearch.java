package array;
import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        int n=arr.length;




      int key=1;

        System.out.println( binarysearch(arr,n,key));
    }
    public static int binarysearch(int arr[],int n,int key){
        int s=0;
        int e=n-1;

        while(s<=e){
            int mid=(s+e)/2;
            if(mid==key){
                return mid;
            } if (mid>key) {
                e=mid-1;

            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
}
