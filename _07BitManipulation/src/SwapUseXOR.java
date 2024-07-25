public class SwapUseXOR {
public static void swap(int a,int b){

    System.out.println("Intial values are:-");
    System.out.println("a="+a);
    System.out.println("b="+b);
    a =a^b;
    b =a^b;
    a =a^b;
    System.out.println("After swap values are:-");
    System.out.println("a="+a);
    System.out.println("b="+b);
}
    public static void main(String[] args) {
int a =10,b=87;
swap(a,b);
}
}
