public class MaxContVol {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxVol = 0;
        while(left < right) {
            int width = right - left;
            if (height[left] < height[right]) {
                int vol = height[left] * width;
                maxVol = vol > maxVol ? maxVol = vol : maxVol;
                left++;
            } else {
                int vol = height[right] * width;
                maxVol = vol > maxVol ? maxVol = vol : maxVol;
                right--;
            }
        }
        return maxVol;
    }
    public static void main(String[] args) {
        MaxContVol maxContVol = new MaxContVol();
        int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        int result = maxContVol.maxArea(arr);
        System.out.println(result);
    }    
}
