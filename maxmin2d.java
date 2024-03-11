package array;
import java.util.*;
public class maxmin2d {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3,},
                {4, 5, 6},
                {7, 8, 9}};
        int n = arr.length;
        int m = arr[0].length;
        System.out.println(maximum(arr, n, m));
    }
    public static int maximum(int arr[][],int n,int m) {


        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j]; 
                }

            }
        }
        return max;
    }
}
