public class ReverseBits {
    public int reverseBits(int n) {
        int ans=0;
        for (int i = 0; i < 32; i++) {
            ans = ans << 1;
            ans = ans | (n & 1);
            n = n >> 1;
        }
        return ans;
    }    
    public static void main(String[] args) {
        ReverseBits reverseBits = new ReverseBits();
        int result = reverseBits.reverseBits(1010);
        System.out.println(result);
    }
}
