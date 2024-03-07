import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner read =new Scanner(System.in);
        System.out.println("Enter the number here to check it is prime or not :--");
int inputNumber =read.nextInt();

if(inputNumber==2) System.out.println("Input Number is Prime");
//It is only even Prime Number
else {


    // this boolean variable is assign to store the or track the input number is prime or not
    boolean isprime = true;
    //loop is use to check input number is completely divisible by any other number than 1 or itself
    //for(int i =2 ;i<inputNumber-1;i++)
    // To optimized this program we can use this for loop like this

    for(int i=2;i<Math.sqrt(inputNumber);i++) //we use square root  of userInput
    {
        if(inputNumber%i==0)
        {
            //if condition satisfy with input number then we set boolean variable as false
            isprime = false;
        }
    }
    if(isprime==true) System.out.println("User Input Number is prime");
        else System.out.println("User Input Number is Not Prime");

}//else end



    }
}

