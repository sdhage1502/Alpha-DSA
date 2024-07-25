public class upperbound {
    public static int implementupper(int arr[],int target){
        int start =0,end= arr.length-1;
        int result=-1;
        while(start<=end){

            int mid =(start+end)/2;
            if(arr[mid]>target){
               // result =arr[mid];
                result =mid;
                end =mid-1;
            } else start=mid+1;

        }

        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,6,7,8};
        int target =5;
        int callmethod = implementupper(arr,target);
        System.out.println(callmethod);

    }
}
