public class firstOccurnece {
    public static int firstOccurenece  (int nums[],int target){
       int start = 0;
       int end =nums.length-1;
       int result =-1;

       while (start <=end ){
          int  mid = (start+end)/2;
          if(nums[mid]==target){
              result =mid;
              start = mid+1;
          }
          else if(target<nums[mid]){
              end =mid-1;
          }else {
              start = mid+1;

          }
       }

        return result;
    }
    public static void main(String[] args) {
        int nums []={ 3,4,13,13,13,20,40};
        int target =21;
        System.out.println( firstOccurenece(nums ,target));
    }
}
  