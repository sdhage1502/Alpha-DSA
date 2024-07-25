public class HollowTriangle {

    static void hollowtriangle(int row,int column) {
// for inverted hoolw triangle
      for(int i=row;i>=1;i--){

        for(int j=1;j<=column;j++){
            if( (i==5)||(i+j==6) || (j-i==4)){
                System.out.print("* ");
            }else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
        System.out.println("=========================================");
      //for simple hollow  triangle
        for(int i =1;i<=row;i++){

            for(int j=1;j<=column;j++){
            if( (i==5)||(i+j==6) || (j-i==4)){
                System.out.print("* ");
            }else {
                System.out.print("  ");
            }
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        hollowtriangle(5,9);
    }
}
