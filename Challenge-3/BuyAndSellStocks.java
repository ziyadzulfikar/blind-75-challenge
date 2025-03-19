public class BuyAndSellStocks {
  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    if(prices.length <= 1) {
      return maxProfit;
    }
    int left = 0;
    for(int i = 1; i < prices.length; i++) {
      if (prices[i] < prices[left]) {
          left = i;
      }
      int profit = prices[i] - prices[left];
      if (profit > maxProfit) {
          maxProfit = profit;
      }
    }
    return maxProfit;
  }
  public static void main(String[] args) {
    BuyAndSellStocks s = new BuyAndSellStocks();
    int[] intArr = new int[]{7,1,5,3,6,4};
    int finalResult = s.maxProfit(intArr);
    System.out.println(finalResult);
  }
}
