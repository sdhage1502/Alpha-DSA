public class TrapedRainWater {

    public static int TrappingRainwater(int height[]){
        int n = height.length;
     //create the array of the max on left side
        int [] leftMax = new int[n] ;
            leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
      //create the array of the max on right side
        int []rightMax =new int[n];
        rightMax[n-1]=height[n-1];
        for(int i= n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
 // now calcultae the trapeed water
        int trappedWater =0;
        for(int i=0;i<n;i++){
          int waterlevel =Math.min(leftMax[i],rightMax[i]);
          trappedWater += waterlevel-height[i];
        }


        return trappedWater;
    }
    public static void main(String[] args) {
        int height[]={3, 0, 0, 2, 0, 4};
        System.out.println(TrappingRainwater(height));
    }
}
