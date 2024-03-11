package array;

import java.util.Scanner;

 class basic_02_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int marks[]= new int [size];
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();

        }
         for(int i=0;i<size;i++){
             if (marks[i] < 35) {
                 System.out.print(marks[i]);
             }
         }


    }
}
