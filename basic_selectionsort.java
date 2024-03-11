package array;

public class basic_selectionsort {
    public static void main(String[] args) {
        System.out.print("insorted array");
        int a[]={2,9,8,4,5};
        int length=a.length;
        for(int i=0;i<length;i++){
            System.out.print(a[i]);
        }
        selection(a,length);
    }
    public static void selection(int a[], int length){
        for(int i=0;i<length;i++){
            int smallest=i;
            for( int j=i+1;j<length;j++){
                if(a[j]<a[smallest])
                    smallest = j;


            }
            int temp=a[smallest];
           a[smallest]=a[i];
           a[i]=temp;

        }
        System.out.println();
        System.out.print("sorted array");
        for(int i=0;i<length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
