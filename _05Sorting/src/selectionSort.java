public class selectionSort {
    static void selectionSorting(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos =i;
            for ( int j=i+1;j<arr.length;j++ ){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            } if(minpos!=i){
                int temp = arr[minpos];
                arr[minpos]=arr[i];
                arr[i]=temp;
            }

        }

    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr [] = {5,2,3,1,4};
        selectionSorting(arr);
        printArr(arr);
    }
}
