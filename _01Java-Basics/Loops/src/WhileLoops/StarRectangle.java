package WhileLoops;

public class StarRectangle {
    public static void main(String[] args) {
        //Using while loop
        System.out.println("Using While loop");
        int i=1;
        int line =4;
        while (i<=line){
            System.out.println("****");
            i++;
        }
        System.out.println("Using For Loop");
        //Using For loop
        for(int j=1;j<=4;j++){
            System.out.println("****");
        }

    }
}
