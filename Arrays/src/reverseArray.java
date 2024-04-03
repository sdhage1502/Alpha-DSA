public class reverseArray {
    public static void reverse(int number[]){
        int first =0;
        int last =number.length-1;
        while(first<last){
            int temp= number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;

        }

    }
    //main method
    public static void main(String[] args) {
        int number []={21,34,54 ,78,9,46};
        System.out.println("original array is:- ");
        for ( int i=0;i<number.length;i++ ) {
            System.out.print(number[i]+ " ");
     }
        System.out.println();

        reverse(number);
        System.out.println("Reverse Array is : -");
        for ( int i =0;i<number.length;i++ ){
            System.out.print(number[i]+" " );

        }
        System.out.println();
    }
}
