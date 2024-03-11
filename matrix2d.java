package array;

import java.util.Scanner;

public class matrix2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int matrix[][]=new int [3][3];
        int n=3;
        int m=3;
//        input the element of the matrix
        for(int i=0;i<n;i++){
            for(int j=0;i<m;i++){
                 matrix[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
