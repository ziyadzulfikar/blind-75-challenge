public class ClimbingStairs {
    public int climbStairs(int n) {
        int result = 1;
        int a = 1;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int result = climbingStairs.climbStairs(5);
        System.out.println(result);
    }
}
