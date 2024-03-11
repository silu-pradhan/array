package array;

public class diagonalsum {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12,},
                {13,14,15,16}};
        System.out.println(diagonal(arr));
    }
    public static int diagonal(int arr[][]){
        int sum=0;
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                if(i+j==m-1){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
}
