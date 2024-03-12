public class DecimalToBinary {
public static void converter(int decimalNo){
    int power=0;
    int binary =0;
     while(decimalNo>0){
          int remainder = decimalNo%2;
          binary = (int) (binary + remainder*Math.pow(10,power));
          power++;
          decimalNo = decimalNo/2;

              }

    System.out.println(binary);
}

    public static void main(String[] args) {
        converter(1001);
    }
}
