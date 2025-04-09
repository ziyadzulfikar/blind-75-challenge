public class HouseRobber2 {
    public int rob(int[] nums) {
        int[] numForw = new int[nums.length - 1];
        int[] numRev = new int[nums.length - 1];
        if(nums.length <= 1) {
            return nums[0];
        }
        for(int i = 0; i < nums.length - 1; i++) {
            numForw[i] = nums[i];
            numRev[i] = nums[i + 1]; 
        }
        return Math.max(getMax(numForw), getMax(numRev));
    }

    private int getMax(int[] nums) {
        if (nums.length <= 2) {
            return nums.length <= 1 ? nums[0] : Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
    
    public static void main(String[] args) {
        HouseRobber2 s = new HouseRobber2();
        int[] arr = {1,2,3,1};
        int result = s.rob(arr);
        System.out.println(result);
    }
}
