public class ButterFly_Pattern {
    public static  void printButterFly(int row) {
            for(int i=1;i<=row;i++) {
        //printing star
        for (int j = 1; j <= i; j++) {
            System.out.print(" " + "*" + " ");
        }
        for (int j = 1; j <= 2 * (row - i); j++) {

            System.out.print(" " + " " + " ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print(" " + "*" + " ");
        }
        System.out.println();
    }


        for(int i=row;i>=1;i--) {
            //printing star
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + "*" + " ");
            }
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" " + " " + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + "*" + " ");
            }
            System.out.println();
        }


}






    public static void main(String[] args) {
        System.out.println("Butterfly");
        printButterFly(5);
    }
}
