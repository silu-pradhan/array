package array.question;

import static java.lang.Math.abs;
import static java.lang.Math.absExact;
import java .util.Scanner;
public class nodecreasing {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("input the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("print the array");
        printthearray(arr);
        System.out.println("square the array");
         int ans[]= sortarray(arr);
         printthearray(ans);
        System.out.println("reverse of the array");
        reverse(ans);

        printthearray(ans);


    }
    static void printthearray (int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    static int []sortarray(int arr[]) {

        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int ans[] = new int[n];
        int k = 0;
        while (left <= right) {
            if (abs(arr[left]) > abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
     return ans;

    }
    static void reverse(int arr[]){
          int n=arr.length;
          int i=0;
          int j=n-1;
         while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
             i++;
             j--;
         }
    }

    }







