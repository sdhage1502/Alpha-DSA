public class PrefixApproach_maxSumSubarray {
    /* THIS AN PREFIX APPORACH FOR THE MAX SUM OF SUB ARRYA
     * YECHAT APPLYA LA EK PREFIX AARAY CALCULATE KARVA LAGNR
     *
     * NOTE:- PREFIX ARRAY MEANS THE SUM OF THE SUB ARRAY STORE ON THE I th INDEX of thier own
     *        mhnje yecht oth index pasun tr i+1 index prayunt sum store kela jate i+1 th index vr
     *      for more reference :-open Prefix-notes
     *
     *

     * */
    public static void maxSumArray(int arr[]) {
        int sum = 0;
        int maxsSUM = Integer.MIN_VALUE;
//calculate the prefix array

        int[] prefix = new int[arr.length];

        for ( int i = 0 ; i < arr.length ; i++ ) {
prefix[0]=arr[0];
            prefix[i] = prefix[i - 1] + arr[i];

            System.out.print(prefix[i] + " ");
        }
//
//        for ( int i = 0 ; i < arr.length ; i++ ) {
//            int start = i;
//            for ( int j = i ; j < arr.length ; j++ ) {
//                int end = j;
//                sum = 0;
//                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
//                //   System.out.print(" : " +sum );
//                if (maxsSUM < sum) {
//                    maxsSUM = sum;
//                }
//
//                System.out.println();
//            }
//
//        }
//        System.out.println(maxsSUM);

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, -3, 2, -1, 7};
        maxSumArray(arr);
    }
}
