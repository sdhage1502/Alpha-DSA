package WhileLoops;
import java.util.Scanner;
public class PrintNumberFrom1_to_N {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER HERE: ");
        int n = read.nextInt();
        int number = 1;
        while (number<=n){

            System.out.print(number +" ");
            number++;
        }

    }
}
