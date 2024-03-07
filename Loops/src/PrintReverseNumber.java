public class PrintReverseNumber {
    public static void main(String[] args) {
        int number= 123456;

        while(0<number) {

            int lastDigit= number%10; //we will get the last digit from the our actual number
            System.out.print(lastDigit);//we will print the last digit from our actual number
            number= number/10;// we will remove the last digit from the number to work and remaininig numbers
        }
//Directly Reverse an Number

        int number2= 123456;

        int reverse=0;
        while(number2>0){
            int lastDigit= number2%10;

            reverse = (reverse*10)+lastDigit;
            number2 = number2/10;

        }
        System.out.println();
        System.out.println(reverse );


    }}
