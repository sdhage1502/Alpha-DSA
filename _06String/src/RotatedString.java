public class RotatedString {
    public static void main(String[] args) {
        String s ="abcde";
        String goal = "cdetb";
        System.out.println(rotateString(s,goal));
    }
        public static boolean rotateString(String s, String goal) {
            if (s.length() != goal.length()) {
                return false;
            }
            String result = s+s ;
                return result.contains(goal);

        }
    }




    //      if (s.length() != goal.length()) {
//                return false;
//            }
//            char[] str = s.toCharArray();
//            char[] t = goal.toCharArray();
//
//         
//
//                for ( int i = 0 ; i < s.length() ; i++ ) {
//
//                    int pos =(idx + i) % t.length;
//                    System.out.println(pos);
//                    if (str[i] != t[pos]) {
//                        return false;
//                    }
//
//
//
//            }
//
//return true;