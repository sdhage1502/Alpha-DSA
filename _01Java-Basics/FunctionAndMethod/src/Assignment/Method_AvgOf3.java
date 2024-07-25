package Assignment;

import java.util.Scanner;

public class Method_AvgOf3 {

    public static int CalAvgOf3(int number1,int number2,int number3){

    return  (number1 + number2 + number3)/3;

    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
    int  number1 = read.nextInt();
      int  number2 = read.nextInt();
        int number3 = read.nextInt();
        System.out.println(CalAvgOf3(number1,number2,number3));
    }
}
