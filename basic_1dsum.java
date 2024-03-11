package array;
import java.util.Scanner;

   public class basic_1dsum {
       public static void main(String[] args) {
           int a[] = {3, 1, 8, 2, 9};
           int length=a.length;
           System.out.println("enter insorted array");
           for(int i=0;i<length;i++){
               System.out.print(a[i]+" ");
           }
           sorting(a,length);


       }

       public static void sorting(int a[], int length) {
           for (int i = 0; i < length; i++) {
               for (int j = 0; j < length - 1;j++) {
                   if (a[j] > a[j + 1]) {
                       int temp = a[j];
                       a[j] = a[j + 1];
                       a[j + 1] = temp;

                   }
               }
           }
           System.out.println();
           System.out.println("enter the sorted array");
           for (int i = 0; i < length; i++) {
               System.out.print(a[i] + " ");
           }
       }
   }