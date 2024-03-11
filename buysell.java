package array;
import java.util.*;
public class buysell {
    public static void main(String[] args) {
        int arr[]={8,3,2,7};
        System.out.println(profit(arr));
    }
    public static int profit(int arr[]){
        int maxprofit=0;
        int minprofit=0;
        int minimum=arr[0];
        for(int i=0;i<arr.length;i++){
            minimum=Math.min(minimum,arr[i]);
            minprofit=arr[i]-minimum;
            maxprofit=Math.max(maxprofit,minprofit);
        }
        return maxprofit;
    }
}
