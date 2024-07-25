public class linearSearchString {
    //function to linear serach a food from the menu array
    public static int linearSearching( String [] menu,  String seletedFood) {
        // here i indicted the index of the array
        for ( int i = 0 ; i < menu.length ; i++ ) {
            if (menu[i].equals (seletedFood)){
                return i;

            }
        }
return -1;
    }

    public static void main(String[] args) {
        String menu[]={"samosa","idli","dosa","dhokla","allo paratha"};
        String seletedFood  ="dhokla" ;
        int index= linearSearching(menu,seletedFood);
        if(index==-1){
            System.out.println("Your food is not available in the menu");
        }else {
            System.out.println("your food is available in the menu");
        }

    }
}
