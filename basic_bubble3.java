package array;
import java.util.Scanner;
public class basic_bubble3 {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int s[]=new int[size];
        for(int i=0;i<size;i++){
            s[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(s[j]>s[j+1]){
                    int temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(s[i]+" ");
        }
    }
}
