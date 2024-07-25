public class sumOfTwoArray {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int []b= {1,2,3};
        System.out.println(sum(a,b));
    }
    public static int[] sum(int []a,int[]b){
        int [] C = new  int[4];
        for(int i =0;i<=a.length-1;i++){
            C[i] =a[i]+b[i];
        }return  C;
    }
}
