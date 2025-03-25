public class MaxSumSubArr {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int currentSum = 0;
        for (int currentVal : nums) {
            currentSum += currentVal;
            maxSub = currentSum > maxSub ? currentSum : maxSub;
            currentSum = currentSum < 0 ? 0 : currentSum;
        }
        return maxSub;
    }
    public static void main(String[] args) {
        MaxSumSubArr maxSumSubArr = new MaxSumSubArr();
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSumSubArr.maxSubArray(arr);
        System.out.println(result);
    }    
}
