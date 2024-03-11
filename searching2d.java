package array;
import java.util.*;
public class searching2d {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int n=matrix.length;
        int m=matrix[0].length;
        int key=5;
        search(matrix,n,m,key);
    }
    public static void search(int matrix[][],int n,int m,int key){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.println("element fond at the index of"+"("+i+","+j+")");
                }
            }
        }
        System.out.println("key element not found ");

    }
}
