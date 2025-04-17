import java.util.HashMap;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>(); 
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], false);
        }
        int longestLength = 0;
        for (int i = 0; i < nums.length; i++) {
            int tempPoint = i;
            int tempLength = 1;
            if (map.containsKey(nums[i])) {
                if (!map.get(nums[i])) {
                    map.put(nums[i], true);
                    tempPoint = nums[i] - 1;
                    while (map.containsKey(tempPoint)) {
                        if (!map.get(tempPoint)) {
                            map.put(tempPoint, true);
                            tempLength++;
                            tempPoint--;
                        }
                    }
                    tempPoint = nums[i] + 1;
                    while (map.containsKey(tempPoint)) {
                        if (!map.get(tempPoint)) {
                            map.put(tempPoint, true);
                            tempLength++;
                            tempPoint++;
                        }
                    }
                }
            }
            longestLength = longestLength > tempLength ? longestLength : tempLength;
        }
        return longestLength;
    }
    public static void main(String[] args) {
        LongestConsecutive s = new LongestConsecutive();
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        int result = s.longestConsecutive(arr);
        System.out.println(result);
    }
}