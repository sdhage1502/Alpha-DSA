
//Enter cost  of 3 items from the user(usingfloatdatatype)-a pencil,a pen and an eraser.
// You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
import java.util.Scanner;

public class TotalBill {
    public static void main(String[] args) {
       Scanner read =  new Scanner(System.in);
       float pencil = read.nextFloat();
       float pen = read.nextFloat();
       float eraser = read.nextFloat();

       float TotalBill= pencil+pen+eraser;

       System.out.println("Total Bill :-"+" "+ TotalBill);

       Float FinalBill= TotalBill + (0.10f * TotalBill);

       System.out.println( "Total Bill With Gst :- " + FinalBill);


    }
}
