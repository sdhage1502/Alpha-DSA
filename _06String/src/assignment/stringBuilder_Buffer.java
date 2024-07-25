package assignment;

public class stringBuilder_Buffer {
    public static void main(String[] args) {
        StringBuilder sbd = new StringBuilder("shreyash");
        System.out.println(sbd.capacity());
   String s = "shreyash";
        System.out.println( s.intern());
        s.intern();
    }
}
