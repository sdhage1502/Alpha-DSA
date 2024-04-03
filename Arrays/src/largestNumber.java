import java.util.*;
public class largestNumber {
    //funtion to find the largest number from the array
    public static int findLargest(int number[]) {
        int largest = Integer.MIN_VALUE;//- infinity
        int smallest =Integer.MAX_VALUE ;
        for ( int i = 1 ; i < number.length ; i++ ) {

            if (largest < number[i]) {
                largest = number[i];
            }

            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println("smallest number from the array is :- " +  smallest);
        return largest;
    }


    public static void main(String[] args) {
         int numbers[]={23,76,83,100,607,276,25};
       
        System.out.println("larget number from the array is :- " +findLargest(numbers));
int maxx = Integer.MIN_VALUE;
        System.out.println(maxx);
    }
}
