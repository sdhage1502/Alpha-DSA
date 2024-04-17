import static java.lang.Math.max;

public class maxSumSubarray_BruteForceApproach {
    public static void printMaxSum(int arr[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){
                 currentSum =0;
                // this k loop is for printing the sub arryas from i to j
                for(int k=i;k<=j;k++){
                   //    System.out.print(arr[k]+" "); //To print the subarrays
                     currentSum+=arr[k];
                }

                System.out.print(":- "+currentSum);
                if (maxSum<currentSum){   //IF MAX IS LESS THAN CURRENT SUM THEN MAXSUM ASSIGN THE VALUE OF THE CURRENT SUM VALUE
                    maxSum=currentSum;
                }
                System.out.println();
            }


        }
        System.out.println("max sum is: " + maxSum );
    }

    public static void main(String[] args) {
            int arr[]={1,-2,3,1,5};
            printMaxSum(arr);
    }
}
