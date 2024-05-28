public class lastOccurence {
    public static int lastOccurence(int nums[],int target){
        int start =0;
        int n = nums.length;
        int end = n-1;
        int result =-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                result =mid;
                start = mid+1;
            }
            else if(nums[mid]<target){
                start = mid+1;

            }else {
                end = mid-1;
            }
        } return result;
    }
    public static void main(String[] args) {
        int nums []={1,2,4,5,6,7,7};
        int target = 7;
        System.out.println(lastOccurence(nums,target));
    }
}
