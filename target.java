package array;

public class target {
  static  void Common(int arr1[],int arr2[],int arr3[]){
        int i=0;
        int j=0;
        int k=0;
  while(i<arr1.length&&j<arr2.length&& k<arr3.length) {
      if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
          System.out.println(arr1[i] + " ");
          i++;
          j++;
          k++;
      } else if (arr1[i] < arr2[j]) {
          i++;
      } else if (arr2[j] < arr3[k]) {
          j++;
      }
      else{
          k++;
      }

  }
    }
    public static void main(String[] args) {

        int arr1[] = {1, 3, 5, 8, 6};
        int arr2[] = {4, 7, 81, 1, 3};
        int arr3[] = {1, 77, 64, 3, 2};

        System.out.println("common element of the array");
        Common(arr1, arr2, arr3);

    }









}
