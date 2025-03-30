public class MissingNum {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum1 = n*(n+1)/2;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return sum1 - sum;
    }
    public static void main(String[] args) {
        MissingNum missingNum = new MissingNum();
        int[] arr = new int[]{9,6,4,2,3,5,7,0,1};
        int result = missingNum.missingNumber(arr);
        System.out.println(result);
    }    
}
