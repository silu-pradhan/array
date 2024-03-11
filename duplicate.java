package array;
import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,4,3,1};
        int n=arr.length;
        Arrays.sort(arr);

        System.out.println(dupli(arr,n));
    }
    public static boolean dupli(int arr[],int n){

        for(int i=0;i<n;i++){

            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;

    }
}
