public class CombinationSum4 {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i < target + 1; i++) {
            for (int n : nums) {
                dp[i] = i-n < 0 ? dp[i] + 0 : dp[i] + dp[i-n];
            }
        }
        return dp[target];
    }
    public static void main(String[] args) {
        CombinationSum4 s = new CombinationSum4();
        int[] nums = {1,2,3};
        int result = s.combinationSum4(nums, 4);
        System.out.println(result);
    }    
}
