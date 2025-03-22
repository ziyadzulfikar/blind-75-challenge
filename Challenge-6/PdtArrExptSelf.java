public class PdtArrExptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            arr[i] = nums[i-1] * arr[i - 1];
        }
        int var = 1;
        for (int j = nums.length - 2; j >= 0; j--) {
            int var2 = nums[j+1] * var;
            arr[j] = arr[j] * var2;
            var = var2;
        }
        return arr;
    }
}
