package assignment;

import java.util.Arrays;

public class reverseWordString {
    public static String ReverseWord(String s){
     if(s.length()==0  ||s==null)return "";

     s = s.replaceAll("\\s+", " ").trim();

        String[] s1= s.split(" ");
     String result ="";
        for(int i=s1.length-1;i>0;i--){
            result = result +  s1[i]+ " ";
        }
        return result+=s1[0];
    }
    public static void main(String[] args) {
        String s ="  Bob    Loves  Alice   ";
        System.out.println( ReverseWord(s));
   }
}
