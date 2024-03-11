package array;

import java.util.Scanner;
public class basic_06_greater {
    public static void main(String[] args) {
        System.out.println("enter the array size");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array []=new int [size];
        int greater=30;
        for(int i=0;i<size;i++){
             array[i]=sc.nextInt();
             if(array[i]<greater){
                greater++;
                 System.out.println(greater);
             }
             else{
                 System.out.println("default value");
             }
        }

    }
}
