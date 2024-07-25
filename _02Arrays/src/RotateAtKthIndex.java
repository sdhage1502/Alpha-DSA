public class RotateAtKthIndex {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;
        int[] rotatedArray = rotate(nums, k);
        System.out.println("Rotated array: ");
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // If k is greater than the size of the array, we adjust it.

        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining elements
        reverse(nums, k, n - 1);

        return nums;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
