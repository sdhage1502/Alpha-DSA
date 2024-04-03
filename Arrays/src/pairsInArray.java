public class pairsInArray {
    public static void PairsInarray(int number[]){
        for(int i=0;i<number.length;i++){
            int current =number[i];
            for ( int j = i+1;j<number.length;j++ ){
                System.out.print("(" + current +"," + number[j] +")" );
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        int number []={1,5,7,3,8,9,3};
        PairsInarray(number);
    }
}
