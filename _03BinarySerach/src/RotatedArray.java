public class RotatedArray {
    public static void main(String[] args) {
        int []nums ={1,2,3,4};
        int k = 3;
        System.out.println(rotated(nums,k));

    }
    public static void rotated(int []nums, int k){
        int start=0;
        int end =nums.length-1;
        k=k%nums.length;
        reverse(nums,start,end);
        reverse(nums,start,k-1);
        reverse (nums,k-1,end);
return ;
    }
    public static int[] reverse(int [] nums, int start, int end){
        while (start>end){
            start = nums[start]^nums[end];
            end =nums[start]^nums[end];
            start = nums[start]^nums[end];
            start++;
            end--;
        } return nums;
    }


}
