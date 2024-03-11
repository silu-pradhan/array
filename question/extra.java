package array.question;

public class extra {
    public static void main(String[] args) {
        int arr[]={1,4,3,4,5};
        int n=arr.length;
        int index=repeat(arr,n);
        if(index==-1){
            System.out.println("array does not found any index");
        }
        else{
            System.out.println("array found the index" +" "+arr[index]);
        }

    }
    static int repeat(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return i;
                }
            }
        }
        return -1;
    }
}
