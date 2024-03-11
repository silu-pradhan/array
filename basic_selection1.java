package array;

public class basic_selection1 {
    public static void main(String[] args) {
        int s[]={2,7,6,9,1,4};
        int length=s.length;
        for(int i=0;i<length;i++){
            int smallest=i;
            for(int j=i+1;j<length;j++){
                if(s[j]<s[smallest])
                    smallest=j;


            }
            int temp=s[smallest];
            s[smallest]=s[i];
            s[i]=temp;
        }
        for(int i=0;i<length;i++){
            System.out.print(s[i]+" ");
        }
    }
}
