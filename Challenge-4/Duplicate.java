import java.util.HashSet;

public class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (duplicate.contains(nums[i])) {
                return true;
            }
            duplicate.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        Duplicate s = new Duplicate();
        int[] intArr = new int[]{7,1,5,3,1,4};
        boolean finalResult = s.containsDuplicate(intArr);
        System.out.println(finalResult);
      }
}
