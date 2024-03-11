package array.question;

public class delete {
    public static void main(String[] args) {
        int arr[]={1,3,5,8,9};
        int n=arr.length;
        int key=10;
        System.out.println("after insert the element");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("after the delete element of the array");
        n=DeleteElement(arr,n,key);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    static int DeleteElement(int arr[],int n,int key){
        int i=0;
        if(n==-1){
            return -1;
        }
        for( i=0;i<n;i++){
            if(arr[i]==key){
                arr[i]=arr[i+1];
            }
        }
        return n-1;
    }
}
