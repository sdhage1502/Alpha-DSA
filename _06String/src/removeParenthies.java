public class removeParenthies {

        public static String removeOuterParentheses(String s) {
            String result =  "";

            for(int i =0;i<s.length();i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    s.replace("i","");
                    System.out.println(s);
                }
            }
            return "";
        }

    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }
    }

