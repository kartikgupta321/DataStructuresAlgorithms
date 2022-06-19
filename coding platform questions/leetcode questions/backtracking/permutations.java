import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans ;
        Solution obj = new Solution();
        ans = obj.permute(nums);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j));
            }
            System.out.println();
        }
    }
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums ,int start){
        if(templist.size() == nums.length) list.add(new ArrayList<>(templist));
        else{
            for (int i = 0; i < nums.length; i++) {
            if(templist.contains(nums[i])) continue;
            templist.add(nums[i]);
            backtrack(list, templist, nums, start);
            templist.remove(templist.size() -1 );   
            }
        }
    }
}