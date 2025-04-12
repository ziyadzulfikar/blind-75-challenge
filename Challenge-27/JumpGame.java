public class JumpGame {
    public boolean canJump(int[] nums) {
        int finalJump = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if(i + nums[i] >= finalJump) {
                finalJump = i;
            }
        }
        if (finalJump == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        JumpGame s = new JumpGame();
        int[] arr = {3,2,1,0,4};
        boolean result = s.canJump(arr);
        System.out.println(result);
    }
}
