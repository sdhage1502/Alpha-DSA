public class stringPalindrome {
        public static boolean CheckPalindrome(String str){
//            for(int i=0;i<str.length()/2;i++){
//                int n = str.length()-1;
//                if(str.charAt(i)!=str.charAt(n-i)){
//                    return false;
//                }
//            }
//            return true;
            System.out.println(str);
            str=str.toLowerCase();
            System.out.println(str);

            for ( int i =0;i<=str.length()/2;i++ ) {
               char start =str.charAt(i),
                    end = str.charAt(str.length()-1-i);
                if(start!=end){
                    return false;

                }
            }

            return true;
        }
    public static void main(String[] args) {
        String Str = "AcBa";

        boolean result = CheckPalindrome(Str);
        if(result==true) {
            System.out.println(Str +" is palindrome");
        }else {
            System.out.println(Str +" is not palindrome");
        }
    }
}
