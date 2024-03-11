package array;
import java.util.*;
public class trapping {
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        int n=arr.length;
        System.out.println(rain(arr,n));
    }
    public static int rain(int arr[],int n){
        int leftmax[]=new int[n];
        leftmax[0]=arr[0];
       int rightmax[]=new int [n];
       rightmax[n-1]=arr[n-1];
//       store all the max element of the left array element
        for(int i=1;i<n;i++){
          leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }
//     store all the max element of the right array
        for(int i=n-2;0<=i;i--) {
            rightmax[i] = Math.max(rightmax[i + 1], arr[i]);
        }
        int waterlevel=0;
        int traped=0;
        for(int i=0;i<n;i++){
          waterlevel=Math.min(leftmax[i],rightmax[i]);
          traped+=waterlevel-arr[i];
        }
        return traped;
    }
}
