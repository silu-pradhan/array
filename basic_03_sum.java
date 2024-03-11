package array;

import java.util.Scanner;

public class basic_03_sum {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int [size];
        int product=1;
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
            product=product*number[i];

        }
        for(int i=0;i<size;i++){
            System.out.println(product);
        }
    }
}
