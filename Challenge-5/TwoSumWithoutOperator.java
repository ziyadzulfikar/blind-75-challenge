public class TwoSumWithoutOperator {
    public int getSum(int a, int b) {
        while (b != 0) {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        TwoSumWithoutOperator s = new TwoSumWithoutOperator();
        int finalResult = s.getSum(1, 2);
        System.out.println(finalResult);
    }
}
