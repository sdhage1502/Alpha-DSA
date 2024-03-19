package Conditional_Stataement_Assignment;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
       Scanner read =new Scanner(System.in);
        System.out.println("Enter The Number Here:-");
        int number = read.nextInt();
        if(number>0)
            System.out.println(number + " "+  "is Postive");
         else
             System.out.println(number + " "+"is negative");
    }
}
