public class Diamond {
    public static void diamond(int row){
        //1nd half of the diamond
        for(int i=1;i<=row;i++){
           // inner loop for spaces
            for (int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            // 2nd inner loop for printing the star
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half of the diamond
        for(int i=row;i>=1;i--){
            // inner loop for spaces
            for (int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            // 2nd inner loop for printing the star
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        diamond(5);
    }
}
