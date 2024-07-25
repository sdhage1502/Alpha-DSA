package assignment;

import java.util.Arrays;

public class AnagramWord {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 ="care";

        boolean result = AnagramCheck(str1,str2);
        if(result){
            System.out.println("STRINGS ARE ANAGRAMS");
        } else System.out.println("STRINGS ARE NOT ANAGRAMS");
    }


    public static boolean AnagramCheck(String str1, String str2){
        //1st check the length of two string it should be same to be an anagram

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length()==str2.length()){

            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

boolean result1 =Arrays.equals(ch1,ch2);

            if(result1){
                return true;
            }else
                return false;


        }else {
            return false;
        }

    }
}
