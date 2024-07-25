public class Hallow_rectangle {

    //Fuction to print hallo rectangle
    public static void hallow_Rectangle(int totalRows ,int totalcolm){
        //outer loop
        for (int i =1;i<=totalRows;i++){

            for(int j=1; j<=totalcolm;j++){

                if(i==1 || i==totalRows || j == 1 || j == totalcolm) {
                    System.out.print(" " + "*" +" ");
                }
                else {
                    System.out.print(" " + "  " );
                }

            }
            System.out.println(" ");
        }

    }



//main method to call that function
    public static void main(String[] args) {
        hallow_Rectangle(9,10);

    }}
