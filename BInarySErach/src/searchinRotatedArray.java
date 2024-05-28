public class searchinRotatedArray {

public static int mini(int arr[]){
    int minindex=0;

    for(int i=0;i<arr.length-1;i++){
        if(arr[minindex]>arr[i]){
           arr[minindex]=arr[i];
        }
    }
    return minindex;
}
public static int leftBInary(int arr[] ,int minindex, int target){
    mini(arr);
    int start =0;
    int end = minindex-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]==target){
            return mid;
        } else if (arr[mid]<target) {
            start = mid-1;

        }else end = mid+1;

    }
    return -1;
}
//    public static int rightBInary(int arr[] ,int minindex, int target){
//mini(arr);
//        int end =arr.length-1;
//        int start = minindex;
//        while(start<=end){
//            int mid=(start+end)/2;
//            if(arr[mid]==target){
//                return mid;
//            } else if (arr[mid]<target) {
//                start = mid+1;
//
//            }else end = mid-1;
//
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        int arr[]={6,7,8,9,12,1,2,3,4,5};
        int target =12;
        int minindex =mini(arr);
        System.out.println("pivot of the rotated array is :- "+ minindex);
        System.out.println(leftBInary(arr,target,minindex));
       // System.out.println(rightBInary(arr,target,minindex));
    }

}
