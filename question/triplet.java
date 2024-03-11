package array.question;
import java.util.Scanner ;
public class triplet {
    public static void main(String[] args) {
        System.out.println(" enter the size of the array");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("input the array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printthearray(arr);
       int ans[]= triplet(arr);
        System.out.println("print the array");
        printthearray(ans);
    }
    static void printthearray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    static int []triplet(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
}
