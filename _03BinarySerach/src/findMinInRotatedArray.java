public class findMinInRotatedArray {

        public static int findMin(int[] nums) {
            int start = 0; // Initialize start pointer to the beginning of the array
            int end = nums.length - 1; // Initialize end pointer to the end of the array

            // Binary search loop to find the minimum element
            while (start < end) {
                int mid = start + (end - start) / 2; // Calculate the mid index to avoid overflow

                // If the middle element is greater than the element at the end,
                // it means the minimum element is in the right half
                if (nums[mid] > nums[end]) {
                    start = mid + 1; // Move the start pointer to mid + 1
                } else {
                    // If the middle element is less than or equal to the element at the end,
                    // it means the minimum element is in the left half including mid
                    end = mid; // Move the end pointer to mid
                }
            }

            // When start == end, we have found the minimum element
            return nums[start]; // Return the minimum element
        }

        public static void main(String[] args) {


            int[] nums = {4, 5, 6, 7, 0, 1, 2}; // Example rotated sorted array
            int minElement = findMin(nums); // Find the minimum element

            System.out.println("The minimum element in the rotated sorted array is: " + minElement);
        }
    }
