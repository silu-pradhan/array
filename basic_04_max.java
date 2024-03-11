package array;

import java.util.Scanner;

public class basic_04_max {
    public static void main(String[] args) {
        System.out.println("the size of the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int [size];
        int max=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(max);
        }
    }
}
