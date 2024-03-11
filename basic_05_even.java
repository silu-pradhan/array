package array;

public class basic_05_even {
    public static void main(String[] args) {
        int number[]={34,45,24,80,60};
        for(int i=0;i<number.length;i++){
            if(number[i]%2 !=0){
                number[i]=number[i]*2;
            }
            else{
                number[i]=number[i]*10;
            }
            for(int j=0;j< number.length;j++){
                System.out.printf("%d\n",number[i]);
            }
        }
    }
}
