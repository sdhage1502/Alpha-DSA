package SwitchStatement;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class SwitchBasic {
    public static void main(String[] args) {
        System.out.println("Food wending Machine");
        System.out.println(" "+"  "+"MENU");
        System.out.println(" 1:Pizza" +" "+ "2:Burger" +" " + "3:Water");
        System.out.println("Enter a Number of your food Which you want to order:- ");
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        switch (number) {
            case 1 :
                System.out.println("PIZAA");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("water");
                break;
            default:
                System.out.println("WAKE UP TO Reality!!!");



        }
        System.out.println("Thank You !!! For your order :) ");

    }
}
