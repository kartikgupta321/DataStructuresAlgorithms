import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets2 {
    public static void main(String[] args) {
        int [] nums = {2,1,2};
        Solution obj = new Solution();
        List<List<Integer>> list;
        list = obj.subsetsWithDup(nums);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j));
            }
            System.out.println();
        }
    }
}
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(),nums,0);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums, int start){
        list.add(new ArrayList<>(templist));
        for (int i = start; i < nums.length; i++) {
            if(i>start && nums[i] == nums [i-1]) continue;
            templist.add(nums[i]);
            backtrack(list, templist, nums, i+1);
            templist.remove(templist.size()-1);
        }
    }
}