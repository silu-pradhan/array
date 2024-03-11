package array;

public class subarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        subarray(arr,n);
    }
    public static void subarray(int arr[],int n){
        int total=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
//                print the subarray
                for(int k=i;k<j;k++){
                    System.out.print(arr[k]);

                    total=arr[k];
                    total++;
                }
            }
            System.out.println();
        }
        System.out.println(total);

    }
}
