package array;

import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size of the array");
       int n=sc.nextInt();
        System.out.println("input of the array");
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int key=sc.nextInt();
       int index=linear(arr,n,key);
       if(index==-1){
           System.out.println("not found");
       }
        System.out.println("the correct position of the array is"+index);
    }
    public static int linear(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
