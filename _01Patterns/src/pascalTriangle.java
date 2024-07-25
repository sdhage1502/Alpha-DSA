public class pascalTriangle {
    public static void pascalTrangle(int rows) {
for(int i =1;i<=rows;i++){
     for(int j=1;j<=i;j++){
         if((i+j)%2==0){
             System.out.print("* ");
         }else System.out.print("  ");
     }
    System.out.println();
}

        for(int i =rows-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pascalTrangle(7);
    }

}