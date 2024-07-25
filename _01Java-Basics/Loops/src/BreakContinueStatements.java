import java.util.Scanner;
public class BreakContinueStatements {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);

 // when break Statement use and when it satisfy the condition it will discontiued the itration of loop
//        for (int i=1;i<=5;i++){
//            if(i==3){
//                System.out.println("out of the loop");
//              break;
//            }
//            System.out.println(i);
//        }
  //Keep entering numbers till user enters a multiple of 10
        System.out.println("Enter the number here");

//        for(int i=1 ; i<=10;i++) {
//            int n= read.nextInt();
//
//            if (n % 10 == 0) {
//                System.out.println("invalid number");
//                break;
//
//            }
//            System.out.println(n);
//        }

  // when contiue statement use and when it satisfy the condition it will skip the particular itartion and contiue with next itration
//  Display all numbers entered by user except multiples of 10

       do {
           int n= read.nextInt();
           if (n % 10 == 0) {
               continue;
           }
           System.out.println("number is"+ n);
       }while (true);

    }
}
