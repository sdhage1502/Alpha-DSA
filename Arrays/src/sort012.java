public class sort012 {
    public static int[] sort012(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] <= arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                }
            }
        return arr;
    }

    public static void main(String[] args) {
        int arr []={0,2,1,2,1,0,1};
        System.out.println(   sort012(arr));
    }
}
