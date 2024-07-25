

public class functionInString {

    //function for print all charcters seprate from string
    public static void Printall(String fullname){
        for(int i=0;i<fullname.length();i++){
            System.out.print( fullname.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        // charAt();
        String Fullname="Shreyash Dhage";
    //    System.out.print( Fullname.charAt(1));

        ////function for print all charcters seprate from string
        //call above function
        Printall(Fullname);
    }
}
