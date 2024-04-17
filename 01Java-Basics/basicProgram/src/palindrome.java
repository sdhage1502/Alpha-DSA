public class palindrome {
    public static void main(String[] args) {
        int number =112211;
       int remainder, sum = 0,temp=0;
        number=temp;
       while(temp!=0){
           remainder=number%10;
           System.out.println(remainder);
           sum=(sum*10)+remainder;
           temp =number/10;
           System.out.println(temp);
       }
       if(number==sum){
           System.out.println("number is palindrome");
       }else {
           System.out.println("number is not palindrome");
       }


    }


    }

