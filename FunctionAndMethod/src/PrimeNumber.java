public class PrimeNumber {


     public static boolean isPrime(int n){
             if(n==2){
             return true;
         }
         for(int i=1;i<=Math.sqrt(n);i++){
            if (n%2==0) {
            return false;
     }
         }
            return true;
     }




    public static void main(String[] args) {
isPrime(5);
    }



}
