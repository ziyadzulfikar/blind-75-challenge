public class MaxPdtSubArr {
    public int maxProduct(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int maxPdt = 0;
        int leftPdt = 1;
        int rightPdt = 1;
        if (nums.length == 1) {
            return nums[0];
        }
        while(left < nums.length) {
            leftPdt *= nums[left];
            rightPdt *= nums[right];
            int maxPdtOfLeftRight = Math.max(leftPdt, rightPdt);
            maxPdt = Math.max(maxPdt, maxPdtOfLeftRight);
            leftPdt = leftPdt != 0 ? leftPdt : 1;
            rightPdt = rightPdt != 0 ? rightPdt : 1;
            left++;
            right--;
        }
        return maxPdt;
    }
    public static void main(String[] args) {
        MaxPdtSubArr maxPdtSubArr = new MaxPdtSubArr();
        int[] arr = new int[]{2,3,-2,4};
        int result = maxPdtSubArr.maxProduct(arr);
        System.out.println(result);
    }
}
