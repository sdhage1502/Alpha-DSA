package assignment;

public class countlowerAlphabetAssignment01 {
    public static int CountVowels(String str){
        int count=0;
        String str1=str.toLowerCase();
        for(int i=0;i<=str.length()-1;i++){

         //   System.out.println(str1);
            if(str.charAt(i)==str1.charAt(i)){
              //   return count++;
                //   if we write here return then The increment of the count in return count++ is incorrect \
                //   because return immediately exits the method,
                //   so it never really increments the count properly.
                count++;
            }

        }
        return count;

    }
    public static void main(String[] args) {
        String str = "AbCDEFGD";
        System.out.println(CountVowels(str));
    }
}
