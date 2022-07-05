import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int [] ratings = {5,4,3,2,1};
        System.out.println(obj.candy(ratings));
    }
}
class Solution {
    public int candy(int[] ratings) {
        int [] candies =new int [ratings.length];
        Arrays.fill(candies, 1);
        for (int i = 1; i < candies.length; i++) {
            if(ratings[i]>ratings[i-1]) candies[i] = candies[i-1]+1;
        }
        for (int i = ratings.length-2; i >=0; i--) {
            if(ratings[i]>ratings[i+1]) candies[i] = Math.max(candies[i], candies[i+1]+1);
        }
        int sum =0;
        for (int i : candies) {
            sum += i;
        }
        return sum;
    }
}