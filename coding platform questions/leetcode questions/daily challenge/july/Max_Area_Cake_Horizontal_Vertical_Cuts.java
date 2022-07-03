import java.util.Arrays;

public class Max_Area_Cake_Horizontal_Vertical_Cuts {
    public static void main(String[] args) {
        int h =1000000000,w=1000000000;
        int[] horizontalCuts = {2};
        int[] verticalCuts = {2};
        Solution obj = new Solution();
        System.out.println(obj.maxArea(h, w, horizontalCuts, verticalCuts));
    }
}
class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int maxhorizontal = horizontalCuts[0];
        int maxvertical = verticalCuts[0];
        for (int i = 1; i < horizontalCuts.length; i++) {
            maxhorizontal = Math.max(maxhorizontal, horizontalCuts[i]-horizontalCuts[i-1]);
        }
        maxhorizontal = Math.max(maxhorizontal, h-horizontalCuts[horizontalCuts.length-1]);
        for (int i = 1; i < verticalCuts.length; i++) {
            maxvertical = Math.max(maxvertical, verticalCuts[i]-verticalCuts[i-1]);
        }
        maxvertical = Math.max(maxvertical, w-verticalCuts[verticalCuts.length-1]);
        return (int)((long)maxhorizontal*maxvertical % 1000000007);
    }
} 