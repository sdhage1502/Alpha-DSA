public class Star_patterns {
    public static void main(String[] args) {


        int ch =1;
        for(int line =1;line<=5;line++) {
            for (int j = 1; j <= line; j++) {
                System.out.print(ch +" ");
                ch++;
            }
            System.out.println();
        }



            System.out.println();
            //Inverted star Pattern
            System.out.println("Inverted Star Pattern");


            for (int line1 = 5; line1 >= 1; line1--) {
                for (int star = 1; star <= line1; star++) {
                    System.out.print(star );
                }
                System.out.println();
            }


        }

    }

