package Assignment;

public class Method_SumofIntegers {
    public static void calSumOfInt(int number){
        int sum=0  ;
        while(number>0){
          int lastdigit = number%10;
          sum +=lastdigit;
          number=number/10;

        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        calSumOfInt(465);
    }
}
