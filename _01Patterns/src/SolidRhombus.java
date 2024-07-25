public class SolidRhombus {
    public static void SoildRhombus(int row){
        //outer loop
        for (int i=1;i<=row;i++){
            //inner loop for printing the spaces
            for (int j=1;j<=row-i;j++){
                System.out.print(" "+" "+" ");
            }
            //2nd inner loop for printing for the star
             for (int j =1;j<=row;j++){
                 System.out.print(" "+"*"+" ");
             }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SoildRhombus(8);
    }
}
