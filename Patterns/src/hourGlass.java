public class hourGlass {
    public static void printHourGlass(int rows)
    {
        //1st upper half of the hour glass
     // this loop is use to run the rows
        for(int a=rows; a>=0;a--){

            //for spaces
            for ( int i = 0; i <= rows - a; i++ ) {
                System.out.print(" ");
            }
            /* for stars */
            for ( int j = 1; j <= (2 * a) - 1; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        for ( int a = 0 ; a <= rows ; a++ ) {

            //for spaces
            for ( int i = 0 ; i <= rows - a ; i++ ) {
                System.out.print(" ");
            }
            /* for rows */
            for ( int j = 1 ; j <= (2 * a) - 1 ; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        printHourGlass(4);
    }}
