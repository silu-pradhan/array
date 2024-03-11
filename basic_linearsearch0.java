package array;
import java.util.Scanner;
public class basic_linearsearch0 {
    public static void main(String[] args) {
        System.out.println("enter the element of the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int s[]=new int[size];
        for(int i=0;i<size;i++){
            s[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(s[j]>s[j+1]){
                    int temp=s[j+1];
                    s[j+1]=s[j];
                    s[j]=temp;
                }
            }
        }
        System.out.println("sorted array is:");
        for(int i=0;i<size;i++){
            System.out.print(s[i]);
        }

        linearsearch(s,size);


    }
    public static void linearsearch( int s[],int size){
       int ke=8;
       for(int i=0;i<size;i++){
           if(s[i]==ke){
               System.out.println(i);
           }
       }
    }

}
