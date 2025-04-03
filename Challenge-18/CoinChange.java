import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 ) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }
        if (dp[amount] != amount + 1) {
            return dp[amount];
        }
        return -1;
    }    
    public static void main(String[] args) {
        CoinChange s = new CoinChange();
        int[] intArr = {1,3,4,5};
        int result = s.coinChange(intArr, 7);
        System.out.println(result);
    }
}
