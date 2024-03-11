package array;

public class basic_add {
    //creating 2d array
    public static void main(String[] args) {
        int arr[][]=
        {{1,2},
            {3,4}

        };
        int brr[][]={
                {4,5},
                {6,7}
        };
        //creating a matrix to store the matrix value
      int c[][]=new int[2][2];
      //addingpr matrix
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
               c[i][j]=arr[i][j]+brr[i][j];
            }

        }

        for(int i=0;i<2;i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j]);

            }
            System.out.println();

            }

        }
}
