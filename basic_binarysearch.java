package array;
import java.util.Scanner;
public class basic_binarysearch {
    public static void main(String[] args) {
        System.out.println("enter the size of the array ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int s[] = new int[size];
        System.out.println("enter the scanner of the array");
        for (int i = 0; i < size; i++) {
            s[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println("sorted the array");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (s[j] >s[j + 1]) {
                    int temp = s[j+1];
                    s[j+1] = s[j ];
                    s[j ] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(s[i] + " ");

        }
       System.out.print( binarysearch(s,size));


    }
    public static int binarysearch(int s[],int size){
        System.out.println();

        Scanner sc=new Scanner(System.in);
       int target=sc.nextInt();
        int low=0;
        int high=size-1;
        int mid;
        while(low<=high){
            mid=low+(high+low)/2;
            if(target==s[mid]){
                return mid;
            }
            else if(target<s[mid]){
                    high=mid-1;
            }
            else {
                   low=mid+1;
            }


        }
        return-1;

    }

}