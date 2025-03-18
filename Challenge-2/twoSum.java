import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {    
       HashMap<Integer, Integer> exists = new HashMap<Integer, Integer>();
       int[] arr = new int[2];
       for (int i = 0; i < nums.length; i++) {
        if (exists.containsKey(target - nums[i])) {
            arr[0] = i;
            arr[1] = exists.get(target - nums[i]);
            break;
        } else {
            exists.put(nums[i], i);
        }
       }
       return arr;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] intArr = new int[]{2,7,11,15};
        int[] finalResult = s.twoSum(intArr, 9);
        for (int i = 0; i < finalResult.length; i++) {
            System.out.println(finalResult[i]);
        }
    }
}