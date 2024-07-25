public class searchinRotatedArray {
   public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target =0;
        int start =0;
        int end =arr.length-1;
       System.out.println(modifedBinarySearch(arr,target,start,end));
    }
    //Here in this approach we wiil break down the entire array into two part and
    // then check in both sub array that our target  lies in them
    // if lies the  apply binary search on the sub array
public static int modifedBinarySearch(int arr[],int target,int start,int end){
       //when start is greater than end just written -1;
       if(start>end)
           return -1;
    int mid = start+(end-start)/2;
    if(arr[mid]==target)

             return mid;

       // check is sub array is soretd or not
    //for the left side sub array or left part
    if(arr[start]<arr[mid])
    {

      //  here we check is target lies in sub array
        //  check in between from 1st to mid element
           if (arr[start] <= target && arr[mid]>=target)
               return modifedBinarySearch(arr,target,start,mid);
           else return modifedBinarySearch(arr,target,mid+1,end);
    }else{
        if (arr[start] <= target && arr[mid]>=target)
            return modifedBinarySearch(arr,target,mid+1,end);
        else return modifedBinarySearch(arr,target,start,mid);
    }
}
}

