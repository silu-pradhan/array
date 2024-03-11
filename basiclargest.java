package array;

import java.util.Scanner;

public class basiclargest {
    public static void main(String[] args) {
        System.out.println("enter a number of element");
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]=new int[size];
       int largest=0;
       int second=0;
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
        }
        //1,2,3,4
        for(int i=0;i<size;i++){
            if(arr[i]>largest){
            second=largest;
                largest=arr[i];

            }
            else if(arr[i]>second){
                second=arr[i];
            }
        }
        System.out.print("first biggest element is"+largest);
        System.out.println();
        System.out.print("second biggest element is"+second);

    }
}
