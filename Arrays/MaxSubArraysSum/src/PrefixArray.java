public class PrefixArray {
public static void perfix(int arr[]){

    int[] prefix =new int[arr.length];

    for(int i =0;i<arr.length;i++){
if(i==0){
    prefix[i]=arr[0];
}else {
    prefix[i] = prefix[i - 1] + arr[i];
}
        System.out.print(prefix[i] + " ");
    }
}
    public static void main(String[] args) {
        int arr[]={1,2,-3,2,-1,7};
        perfix(arr);
    }
}
