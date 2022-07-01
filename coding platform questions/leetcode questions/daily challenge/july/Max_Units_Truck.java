import java.util.Arrays;

class Max_Units_Truck{
    public static void main(String[] args) {
        int[][] boxTypes = { {1,3},{2,2},{3,1} };
        int truckSize = 4;
        Solution obj = new Solution();
        System.out.println(obj.maximumUnits(boxTypes, truckSize));
    }
}
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans = 0;
        Arrays.sort(boxTypes, (a,b)-> b[1] - a[1]);
        for (int i = 0; i < boxTypes.length; i++) {
            if(truckSize==0) return ans;
            if(truckSize - boxTypes[i][0]>0 ) {
                truckSize -= boxTypes[i][0];
                ans += boxTypes[i][0] * boxTypes[i][1];
            }
            else{
                ans += truckSize * boxTypes[i][1];
                truckSize = 0;
            }
        }
        return ans;
    }
}