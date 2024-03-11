package array.question;

public class sortalgo {
    public static void main(String[] args) {
        int arr[]={1,2,0,2,1,2,0,2,1,0};
        int length=arr.length;
        rotate(arr);
        printarr(arr);
    }
    static void rotate(int arr[]){
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;

            }

        }

    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void printarr(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }

    }

}


