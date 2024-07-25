public class largestOddNumberinString {
    public static void main(String[] args) {
        String num ="527";
        System.out.println(largestOddNumber(num));
    }
    public static String largestOddNumber(String num) {


      for( int i=num.length()-1;i>=0;i--){
         char ch =num.charAt(i);
   if((ch-'0')%2!=0){
       return num.substring(0,i+1);
   }

            } return "";

        }


        

    }
