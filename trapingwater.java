package array;
import java.util.*;
public class trapingwater {
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        int n=arr.length;
        rain(arr);

    }
    public static void rain(int arr[]){
//        print the left max arr
      int leftmax[]=new int[arr.length];
      leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        int rightmax[]=new int [arr.length];
        rightmax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
//        for printing the water level of the column
        int waterlevel=0;
         int totalwater=0;
        for(int i=0;i<arr.length;i++){
            waterlevel=Math.min(leftmax[i],rightmax[i]);
            totalwater+=waterlevel-arr[i];

        }
        System.out.println(totalwater);
    }
}
