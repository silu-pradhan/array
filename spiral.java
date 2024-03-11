package array;

public class spiral {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        printspiral(arr);
    }
    public static void printspiral(int arr[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = arr.length-1;
        int endcol = arr[0].length-1;
        while (startrow <= endrow && startcol <= endcol) {


//        print the top side of the array
            for (int i = startcol; i <= endcol; i++) {
                System.out.print(arr[startrow][i]+" ");

            }
//        print the right side of the array
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(arr[i][endcol]+" ");
            }
//        print the bottom side of the array
            for (int i = endcol - 1; i >= startcol; i--) {
                System.out.print(arr[endrow][i]+" ");
            }
            for (int i=endrow-1;i>=startrow+1;i--){
                System.out.print(arr[i][startcol]+" ");
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
    }
}
