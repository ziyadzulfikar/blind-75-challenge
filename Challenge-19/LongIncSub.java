import java.util.Arrays;

public class LongIncSub {
    public int lengthOfLIS(int[] nums) {
        int[] arr = new int[nums.length];
        int maxVal = 1;
        Arrays.fill(arr, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (nums[j] < nums[i]) {
                    if ((arr[j] + 1) > arr[i]) {
                        arr[i] = arr[j] + 1;
                        maxVal = maxVal < arr[i] ? arr[i] : maxVal;
                    }
                }
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        LongIncSub s = new LongIncSub();
        int[] arr = {10,9,2,5,3,7,101,18};
        int result = s.lengthOfLIS(arr);
        System.out.println(result);
    }
}
