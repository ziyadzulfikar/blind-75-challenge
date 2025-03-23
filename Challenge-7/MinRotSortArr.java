public class MinRotSortArr {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            int mid = (left + right)/2;
            if (nums[right] < nums[mid]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
    public static void main(String[] args) {
        MinRotSortArr s = new MinRotSortArr();
        int[] arr = new int[]{4,5,6,7,0,1,2};
        int finalResult = s.findMin(arr);
        System.out.println(finalResult);
    }
}
