package SwitchStatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter value a : ");
        int a=read.nextInt();

        System.out.print("Enter a operation");
        char oprations = read.next().charAt(0);

        System.out.print("Enter value b: ");
        int b=read.nextInt();

        switch (oprations){
            case '+' :System.out.println( a + " + " + b + " :- " + (a+b));
                      break;
            case '-' :System.out.println( a + " - " + b + " :- " + (a-b));
                break;
            case '*': System.out.println(a + " * " + b + " :- " + (a*b));
                break;
            case '/': System.out.println(a + " / " + b + " :- " +(a/b));
                break;
                case '%' : System.out.println(a + " % " + b + " :- " +a%b);
                    break;
            default:
                System.out.println("Invaild opration");



        }











    }
}
