package array;

public class pair {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        pair(arr,n);
    }
    public static void pair(int arr[],int n){
        int total=0;
        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                total++;
            }



            System.out.println();

        }
        System.out.println(total);



    }
}
