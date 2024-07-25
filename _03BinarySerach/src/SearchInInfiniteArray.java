
///HERE IN INFINITE SORT ARRAY WE ARE INTIAL SEARCHING THE TARGET IN CHUNK OF THE ARRAY IF WE DETECTED THAT TARGET CAN
//IN THE PARTICALUAR CUNK OF ARRAY THEN WE WILL APPLY THE BINARY SEARCH ON THE CHUNK ON ARRAY
//HERE WE TAKE FIRST CHUK OF SIZE  2 THEN DOUBLED IT


public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(findStartEnd(arr,target ));
    }
    public static int findStartEnd(int arr[],int target){
        int start =0;
        int end =1;
        while(target>arr[end]){
            //taking new temp variabl;e for calculating the next start
            int newStart = end+1;
            end = end + (end -start+1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int arr[] ,int start,int end,int target){

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

}
