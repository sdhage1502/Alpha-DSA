public class ReverseString {
    public static void revString(String name){
        String rev=" ";
        for(int i=name.length()-1;i>=0;i--){
            rev =rev+name.charAt(i);

        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        String name= "shreyash";
        revString("shreyash");
    }
}
