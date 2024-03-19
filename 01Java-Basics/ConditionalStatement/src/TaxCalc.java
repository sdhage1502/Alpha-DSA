import java.util.Scanner;
public class TaxCalc {
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
            int income = read.nextInt();
    int tax;
    
    if(income<=500000){
        tax=0;
    } else if (income>50000 && income<=1000000) {
        tax= (int) (income*0.2);
        
    }
    else {
        tax= (int) (income*0.3);
    }
    System.out.println("Your tax is :"+ tax);
    }
}
