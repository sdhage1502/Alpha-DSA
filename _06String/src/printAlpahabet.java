import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class printAlpahabet {
    public static void main(String[] args) {
     StringBuilder sb = new StringBuilder();
      String series ="shreyash Vasant Dhage";
         for(int i=0;i<26;i++){
             char ch =  (char) ('A' + i );
      // series+=ch;
             sb.append(ch);

         } System.out.println(series);

      //  System.out.println(sb.reverse());
        //System.out.println(sb.toString());

        System.out.println(Arrays.toString(series.toCharArray()));
        System.out.println(series.toUpperCase());
        System.out.println(series.indexOf("D"));
        System.out.println(Arrays.toString(series.split("")));
    }
}
