public class linearSearch {
    //funtion to serach the key from the follwing array of number in linear order

    public static int linearSearching(int number[],int key) {
        for ( int i = 0 ; i < number.length ; i++ ) {
            if (number[i] == key) {
                return i;
            }

        }
        return -1;
    }


    //main method
    public static void main(String[] args) {
        int number[] ={2,5,7,12,16,8,9,10};
        int key=0;



      //  function call kela number mhnjech key find karna satthi applya array mdhun
       // ani he function linear searching krto

        int index = linearSearching(number,key);
        if(index ==-1){
            System.out.println("Number is not found in the array");
        }else System.out.println(key + " is found in the array");





    }
}
