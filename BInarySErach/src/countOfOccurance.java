public class countOfOccurance {


    public static  int count(int arr [] ,int target ){

       int start =0;
       int end=arr.length-1;
       int count=0;

       while(start<=end){
           count=0;
           int mid = (start+end)/2;
           if(arr[mid]==target){
               count++;
               start=mid-1;
           }
           else if (arr[mid]<target){
               start=mid-1;
           }else end=mid-1;

       }
        return count;

    }
    public static void main(String[] args) {
        int arr []={1,1,2,2,3,3,3,4,4};
        int target =3;
        System.out.println(count(arr,target));
    }
}
