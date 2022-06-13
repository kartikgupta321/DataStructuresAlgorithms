public class trapping_rainwater {
    public static void main(String[] args) {
        int[] height ={4,2,0,3,2,5};
        Solution s = new Solution();
        System.out.println(s.trap(height));
    }
}
class Solution {
    public int trap(int[] height) {
        int ans=0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int max =0;
        for (int i = 0; i < height.length; i++) {
            left[i] = max;
            if (height[i]>max) {
                max = height[i];    
            }
        }
        max =0;
        for (int i = height.length-1; i >=0 ; i--) {
            right[i] = max;
            if (height[i]>max) {
                max = height[i];    
            }
        }
        for (int i = 0; i < right.length; i++) {
            if (Math.min(left[i], right[i])- height[i] >0 ) {
                ans += Math.min(left[i], right[i])- height[i];
            }
        }
        return ans;
    }
}