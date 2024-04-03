import static java.lang.Math.max;

public class maxSumSubarray  {
    public static void printMaxSum(int arr[]){
        int maxSum=0;
        for(int i=0;i<arr.length;i++){
            int sum  =0;
            for(int j=0;j<arr.length;j++){
                maxSum= maxSum + arr[j];
                maxSum =Math.max(sum,maxSum);
            }


        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
            int arr[]={1,-2,-1,3,4,2};
            printMaxSum(arr);
    }
}
