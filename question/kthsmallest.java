package array.question;
  import java .util.Scanner;
public class kthsmallest {
    public static int findKthSmallest(int[] arr, int k) {
////        / sort the array in ascending order
//
        return arr[k - 1]; // return the kth smallest element (0-indexed)
    }

    public static void main(String[] args) {
        int arr[] = {15,76, 7, 9, 10, 40};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the kth element");
        int k = arr.length;
        int n=sc.nextInt();
        for (int i = 0; i < k ; i++) {
            for (int j = i + 1; j < k; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
//        bubble sort
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(findKthSmallest(arr, n));


    }

}