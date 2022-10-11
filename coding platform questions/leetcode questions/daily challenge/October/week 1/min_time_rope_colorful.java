public class min_time_rope_colorful {
    public static void main(String[] args) {
        String colors="aaabbbabbbb";
        int[] neededTime = { 3,5,10,7,5,3,5,5,4,8,1};
        Solution obj = new Solution();
        System.out.println(obj.minCost(colors, neededTime));
    }
}
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum = 0,max = 0;
        for (int i = 0; i < colors.length()-1; i++) {
            while (i < colors.length()-1 && colors.charAt(i)==colors.charAt(i+1)) {
                sum+=neededTime[i];
                max = Math.max(max, neededTime[i]);
                i++;
            }
            if(i>0 && colors.charAt(i)==colors.charAt(i-1)){
                sum+=neededTime[i];
                max = Math.max(max, neededTime[i]);
                sum-=max;
            }
            max = 0;
        }
        return sum;
    }
}