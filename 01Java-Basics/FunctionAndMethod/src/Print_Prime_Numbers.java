import java.util.Scanner;

public class Print_Prime_Numbers {

    public static void PrimeRange(int n){
        for(int i=2;i<=n;i++)
        {
            // PrimeNumber.isPrime  where PrimeNumber is class from same package of this present class and
            // isPrime is the function inside the PrimeNumber class which is use to calculate the prime number
            if (PrimeNumber.isPrime(i))
                System.out.print(i +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n= read.nextInt();
        System.out.println("Specify the range for prime number printing.:-");
        PrimeRange(n);
    }

}
