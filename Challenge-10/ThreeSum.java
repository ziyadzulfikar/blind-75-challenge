import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 3; i++) {
             int left = i + 1;
             int right = nums.length-1;
             while (left < right) {
                 List<Integer> resultSum = new ArrayList<Integer>();
                 int sum = nums[i] + nums[left] + nums[right];
                 if (sum < 0) {
                     left++;
                 } else if (sum > 0) {
                     right--;
                 } else {
                     resultSum.add(nums[i]);
                     resultSum.add(nums[left]);
                     resultSum.add(nums[right]);
                     if (!result.contains(resultSum)) {
                         result.add(resultSum);
                     }
                     left++;
                 }
             }
        }
        return new ArrayList<>(result);
     }

    public static void main(String[] args) {
        ThreeSum s = new ThreeSum();
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> result = s.threeSum(arr);
        System.out.println(result);
    }  
}
