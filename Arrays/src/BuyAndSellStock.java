public class BuyAndSellStock {
public static int buySell(int prices[]){
    int buyprice=Integer.MAX_VALUE; // TAKE THIS VARAIBLE TO STORE THE OR TRACK THE LOWEST PRICE FROM THE ARRRAY
    int maxprofit=0; //to store the maxprofit

    for(int i=0;i<prices.length;i++){
        if (buyprice < prices[i]){
    /* here we check the is our buyprices is less than current day price ie = prices[i];
     our intial buy prices is + infinite(Integer.MAX_VALUE) means highest possible value,    */
        int currentProfit = prices [i]-buyprice; //here we calculate the current profit
        maxprofit= Math.max(maxprofit,currentProfit); // here we stroed the maxprofit by comapraing with currenprofit
        }
        else {    // this else statement is use when buyrpice is not less than our cureent prices
            buyprice=prices[i]; // then we assign the buyprices as the current prices i.e
        }
    }
return maxprofit; // at last return our max profit
    }

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int finalMaxprofit = buySell(prices);
        System.out.println(finalMaxprofit);
    }
}
