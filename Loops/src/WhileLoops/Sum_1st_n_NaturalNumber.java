package WhileLoops;
import java.util.Scanner;
public class Sum_1st_n_NaturalNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int i = 1;
        int sum =0;
        while(i<=n){
            sum=sum+i;
            i++;

        }
        System.out.println(sum);
    }
}
