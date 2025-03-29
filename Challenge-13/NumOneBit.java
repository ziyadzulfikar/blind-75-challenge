public class NumOneBit {
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            n = n&(n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        NumOneBit s = new NumOneBit();
        int n = 11;
        int result = s.hammingWeight(n);
        System.out.println(result);
    }
}
