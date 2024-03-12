public class BinaryToDecimal {

public  static void Converter(int BinaryNum) {
    int binary = BinaryNum;
    int decimal = 0;
    int power = 0;


    while (BinaryNum > 0) {
        int lastDigit = BinaryNum % 10;
        decimal = (int) (decimal + lastDigit * Math.pow(2, power));
        power++;

        BinaryNum = BinaryNum / 10;

    }
    System.out.println(binary + ":-" + decimal);





}

    public static void main(String[] args) {
        Converter(1111);
    }
    }






