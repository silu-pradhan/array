package array;
import java.util.Scanner;
public class basicsantanu {
    public static void main(String[] args) {
        System.out.println("enter the array number");
        Scanner sc=new Scanner(System.in);
        int  size= sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       for(int i=size-1;i>=0;i--){
           System.out.print(arr[i]);
       }

    }

}
