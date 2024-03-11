package array;

public class basic_secomd {
    public static void main(String[] args) {
        int s[]={9,3,1,8,5};
        int length=s.length;
        for(int i=0;i<length;i++){

            for(int j=0;j<length-1;j++){
                if(s[j+1]<s[j]){
                     int temp=s[j];
                     s[j]=s[j+1];
                     s[j+1]=temp;
                }
            }
        }

        for(int i=0;i<length;i++){
            System.out.print(s[i]+" ");
        }


    }
}
