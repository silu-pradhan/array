package array;

public class basic_linearsearch {
    public static void main(String[] args) {
        int s[]={12,34,67,89,43};
        int length=s.length;
        int target=67;
        linearsearch(s,length,target);

    }
    public static void linearsearch(int s[],int length,int target){
        if(length==0){
            System.out.println("array is empty");
        }
        for(int index=0;index<length;index++){
            if(s[index]==target){
                System.out.println(index);
            }

        }
    }
}
