public class Inverted_half_pyramid {
    public static void Inverted_halfPyramid(int row){
        for(int i=1;i<=row;i++){
            // TO printing the spaces
            for (int j =1;j<=row-i;j++){
                System.out.print( " " + " " +" ");
            }
            // to printing the Star
            for(int j = 1; j<=i;j++){
                System.out.print( " " + "*" +" ");            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
            Inverted_halfPyramid( 7);
    }
}
