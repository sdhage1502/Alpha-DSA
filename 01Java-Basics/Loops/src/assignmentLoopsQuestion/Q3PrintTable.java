package assignmentLoopsQuestion;
import java.util.Scanner;
public class Q3PrintTable {
    public static void main(String[] args) {
Scanner read = new Scanner(System.in);
        System.out.println("Enter the number here to genrate the Table:-");
int number = read.nextInt();
int table=0;
for(int i=1; i<=10;i++){
   table= number*i;
        System.out.println(table);
    }
    }
}
