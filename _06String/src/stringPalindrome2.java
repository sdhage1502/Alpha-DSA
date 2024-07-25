
    import java.util.* ;
import java.io.*;
    public class stringPalindrome2 {

        public static void main(String[] args) {
String str ="A1b22Ba";
            str =str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
            StringBuilder sb = new StringBuilder("");
            for(int i=0;i<str.length();i++){
                char lower = Character.toLowerCase(str.charAt(i));
                sb.append(lower);

            }
            System.out.println(str);
        }
    }

