package SwitchStatement;
import java.util.Scanner;
public class assignment_WeekCalender {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7 :- " );
        int weeks = read.nextInt();
        switch(weeks){
            case 1 :
                System.out.println("Today is Monday");
                break;
            case 2 :
                System.out.println("Today is Tuesday");
                break;
            case 3 :
                System.out.println("Today is wednesday");
                break;
            case 4 :
                System.out.println("Today is Thursday ");
                break;
            case 5 :
                System.out.println("Today is Friday");
                break;
            case 6 :
                System.out.println("Today is Saturday");

            case 7 :
                System.out.println("Today is sunday");
                break;

            default :
                System.out.println("Invalid Entry");




        }
    }
}
