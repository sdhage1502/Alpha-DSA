public class floor {
    static int floor(int arr[] ,int target){
        int start =0;
        int end =arr.length;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return  mid;
            } else if (arr[mid]<target){
                start = mid+1;
            } else {
                end = mid-1;
            }
            mid = start+(end-start)/2;
            }
        return end;
    }

    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,19};
        System.out.println(floor(arr,1));
    }
}
