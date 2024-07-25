public class Number_halfPyramid {
    public static void number_halfPyramid(int rows ){
        for(int i = rows;i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        number_halfPyramid(5);
    }
}
