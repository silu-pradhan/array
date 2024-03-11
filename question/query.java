package array.question;
import java.util.Scanner ;
public class query {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.print("input of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int prefsum[]=makearr(arr);
        System.out.println("enter the query of the array");
        int q=sc.nextInt();
        while(q>0) {
            System.out.println("enter the range of the array");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefsum[r] - prefsum[l - 1];
         System.out.println(ans);
        }
    }
   static  int[] makearr(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]+=arr[i];
        }
        return  arr;
    }
}
