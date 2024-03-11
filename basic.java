package array;

public class basic {
    public static void main(String[] args) {
        int number[]={2,3,4,5,6,7};
        int sumeven=0;
        int sumodd=0;
        int resultand=0;
        for(int i=0;i< number.length;i++){
            if(number[i]%2==0){
                sumeven=number[i]+sumeven;
                System.out.println( "the value of even"+sumeven);

            }
            else{
                sumodd=number[i]+sumodd;
                System.out.println("the value of odd"+sumodd);
            }
            resultand=sumeven+sumodd;
            System.out.println(resultand);
        }
    }
}
