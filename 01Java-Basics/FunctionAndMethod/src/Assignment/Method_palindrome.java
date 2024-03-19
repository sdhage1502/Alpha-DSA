package Assignment;

public class Method_palindrome {
    public static void PalindromeChecker(int number){
int Given_number=number;
        int reverse =0;
        while (number>0) {

            int lastdigit = number % 10;
            reverse = (reverse*10)+lastdigit;
            number = number / 10;


        }

        if(Given_number==reverse){
            System.out.println( Given_number +" is palindrome number");
        }else System.out.println( Given_number + " is not palindrome number");
    }

    public static void main(String[] args) {
        PalindromeChecker(445544);
    }
}
