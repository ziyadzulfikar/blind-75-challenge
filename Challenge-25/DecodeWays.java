public class DecodeWays {
    public int numDecodings(String s) {
        int[] arr = new int[s.length() + 1];
        arr[0] = 1;
        arr[1] = s.charAt(0) != '0' ? 1 : 0;
        for (int i = 2; i < arr.length; i++) {
            int oneDigit = Integer.valueOf(s.substring(i-1, i));
            int twoDigit = Integer.valueOf(s.substring(i-2, i));
            if (oneDigit != 0) {
                arr[i] = arr[i] + arr[i - 1];
            }
            if (twoDigit >= 10 && twoDigit <= 26) {
                arr[i] = arr[i] + arr[i - 2];
            }
        }
        return arr[arr.length - 1];
    }
    public static void main(String[] args) {
        DecodeWays s = new DecodeWays();
        int result = s.numDecodings("122016");
        System.out.println(result);
    }
}
