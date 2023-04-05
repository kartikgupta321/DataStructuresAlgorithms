import java.util.Arrays;

public class BoatsSavePeople {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] people = {3,2,2,1};
        // int[] people = {1,2};
        // int[] people = {3,5,3,4};
        System.out.println(obj.numRescueBoats(people, 3));
    }
}

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans = 0;
        int i = 0;
        int j = people.length-1;
        while(i<=j){
            if(people[j]+people[i]<=limit){
                ans++;
                j--;
                i++;
            }
            else {
                j--;
                ans++;
            }
        }
        return ans;
    }
}