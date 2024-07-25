import java.util.* ;
import java.io.*;
public class factorial_mod
{
    public static int boringFactorials(int n, int p)
    {    int fact =1;
        for(int i=1;i<=n;i++){
            fact =fact*i;
        }
        int result = fact%p;
        return fact;
    }

    public static void main(String[] args) {
 int n =18;
 int p =19;
        System.out.println( boringFactorials(n,p));

     }
}
