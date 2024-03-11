package array;
import java.util.Scanner;
public class basic_bubble01 {
    public static void main(String[] args) {
        System.out.println("insorted array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);

        }
        bubble(a, size);
    }

    public static void bubble(int a[], int size) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {

                    int temp = a[j];
                    a[i] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
            System.out.println();
            System.out.println("sorted array");

        }
        for (int i = 0; i < size; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
