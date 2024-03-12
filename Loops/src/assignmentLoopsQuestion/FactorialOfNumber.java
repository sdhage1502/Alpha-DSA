package assignmentLoopsQuestion;
import java.util.Scanner;
public class FactorialOfNumber {
    public static  void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.println("Enter The NUmber to Find out the Factorial :-");
        int number=read.nextInt();
         int fact = 1;

        for(int i=1; i<=number;i++ )
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
