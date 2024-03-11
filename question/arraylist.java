package array.question;

import java.util.ArrayList;

public class arraylist {
    public static <integer> void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(4);
        l1.add(5);
        l1.add(6);
//
//
//        adding the array element of the
        l1.add(1,100);
        System.out.println(l1);
//        modifing the array
        l1.set(1,10);
        System.out.println(l1);
//        removing the array index element
        l1.remove(1);
        System.out.println(l1);
//      remove the array element


    }
}
