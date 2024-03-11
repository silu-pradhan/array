package array.question;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.swap;

public class evenodd {
    public static void main(String[] args) {
        System.out.print("enter the size of the array");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the array input");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("print the array");
        printarr(arr);
        System.out.print("sorted array");
        position(arr);
        System.out.print("sorted array");
        printarr(arr);




    }
    static void printarr(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    static void  position(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]%2==1&&arr[right]%2==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;

            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }

        //int left=0;
       // int right=n-1;
      //  while(left<right){

            for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
            if(arr[i]%2==1){
                System.out.println(arr[i]);
            }
        }
    }


}


