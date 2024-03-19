package Conditional_Stataement_Assignment;
import java.sql.SQLOutput;
import  java.util.Scanner;
public class LeapYear
{

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter year Here :-");
        int year = read.nextInt();

        //1st loop
        if((year%4==0 && year%100!=0) || (year%4==0 && year%400==0) )
        {System.out.println("LEAP");
        }
        //1st loop
        else {
            System.out.println("not leap");
        }






    }}



