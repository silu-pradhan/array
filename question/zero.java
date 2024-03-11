package array.question;
import java.util.Scanner;
public class zero {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element of the of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printarr(arr);
        sortzeroandones(arr);
        System.out.println("sorted array ");
        printarr(arr);

    }

    static void printarr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

    static void sortzeroandones(int arr[]) {
        int n = arr.length;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zero++;
            }

        }

        for (int i = 0; i < n; i++) {
            if (i < 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }
}
