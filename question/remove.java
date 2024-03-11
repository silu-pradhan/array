package array.question;

public class remove {
    public static void main(String[] args) {
        int arr[]={1,5,4,2,5,3,5};
        int val=5;
        int n=arr.length;
        System.out.println(sort(arr,val,n));
    }
    static int sort(int[] arr,int val,int n){
        int i=0;
       int ans=0;
       for(i=0; i<n ; i++){
          if(arr[i]!=val){
              arr[ans++]=arr[i];
          }


       }
       return ans;
    }
}
