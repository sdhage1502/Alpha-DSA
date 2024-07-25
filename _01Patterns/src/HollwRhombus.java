public class HollwRhombus {
    public static void hollwRhombus(int row, int column){
        //outer loop
        for (int i=1;i<=row;i++){

            //inner loop for printing the spaces
            for (int j=1;j<=row-i;j++){
                System.out.print(" " + " " + " ");
            }

            //2nd inner loop for printing hallw star rectangle
            for(int j=1; j<=column;j++){

                if(i==1 || i==row || j == 1 || j == column) {
                    System.out.print(" " + "*" + " ");
                }
                else {
                    System.out.print(" " + " " + " ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollwRhombus(9,10);
    }
}
