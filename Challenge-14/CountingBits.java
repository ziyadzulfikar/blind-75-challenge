import java.util.Arrays;

public class CountingBits {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i/2] + i%2;
        }
        return arr;
    }
    public static void main(String[] args) {
        CountingBits countingBits = new CountingBits();
        int[] result = countingBits.countBits(5);
        System.out.println(Arrays.toString(result));
    }    
}
