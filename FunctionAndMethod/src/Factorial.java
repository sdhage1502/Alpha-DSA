public class Factorial {
    public static int CalcFact(int inputNumber){
        int fact=1;
        for(int i=1;i<=inputNumber;i++){
            fact*=i;
        }return fact;
    }

    public static void main(String[] args) {
        int facto= CalcFact(5);
        System.out.println(facto);
    }
}
