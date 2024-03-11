package array;

import java.util.Scanner;

public class basic_01_first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int size= sc.nextInt();
        int  number  [] =new int[size];
        for(int i=0;i< size;i++){
           number[i]= sc.nextInt();


        }
        System.out.println("the number is:");
        for(int i=0;i<size;i++) {
            System.out.println(number[i]);
        }


        }
}
