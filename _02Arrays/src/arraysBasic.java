import java.util.Scanner;

public class arraysBasic {
    public static void main(String[] args) {
        int marks[]=new int[100];
        Scanner read =new Scanner(System.in);

        marks[0]=read.nextInt();
        marks[1]=read.nextInt();
        marks[2]=read.nextInt();

        System.out.println("phy :-" + marks[0]);
        System.out.println("chem :-" + marks[1]);
        System.out.println("math :-" + marks[2]);

        int percentage =(marks[0]+marks[1]+marks[0])/3;
        System.out.println("percenatge :- " + percentage +"%");
        System.out.println(marks.length );

    }
}
