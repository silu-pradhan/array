package array.question;

public class EVEN {
    public static void main(String[] args) {
        int arr[]={ 2,1,5,3,7,2};
        int n=arr.length;
        evenindex(arr,n);

    }
    static void evenindex(int arr[],int n) {
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                //for even
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
            //for odd
            else {
                if (arr[i] > arr[i - 1]) {
                    int temp = arr[i];

                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }


    }
}
