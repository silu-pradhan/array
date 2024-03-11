package array.question;

class Solution {
  public static  Boolean Palindrome(String s) {
        for(int i=0;i<s.length()/2;i++){
           int n=s.length();
           if(s.charAt(i)==s.charAt(n-1-i)){
               return true;
            }
        }
        return false;

        // code here
    }

    public static void main(String[] args) {
        String str="racecar";
        System.out.println(Palindrome(str));

    }
};
