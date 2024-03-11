
package array;
        import java.util.Scanner;

public class basic_element {
    public static void main(String[] args) {
        System.out.print("enter the first element");
        Scanner sc=new Scanner(System.in);
        int rowsize= sc.nextInt();
        int arr[]=new int[ rowsize];
        System.out.print("enter the second element");
        int columnsize=sc.nextInt();
        int number[][]=new int[rowsize][columnsize];
        for(int i=0;i<rowsize;i++){
            for(int j=0;j<columnsize;j++){
                number[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rowsize;i++){
            for(int j=0;j<columnsize;j++) {


                System.out.print(number[i][j] + " ");

            }
            System.out.println("\n");
        }
    }
}
