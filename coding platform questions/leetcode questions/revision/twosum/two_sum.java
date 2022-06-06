package twosum;

import java.util.HashMap;
import java.util.Map;

class two_sum{
    public static int[] twoSum(int[] nums, int target) {
        int arr[] = {0,0};
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i]) == false){
                map.put(nums[i], i);
            }
            else{
                arr[1] = (int) map.get(target-nums[i]);
                arr[0] = i;
            }
        }
        return arr;
    }
public static void main(String[] args) {
    int nums[] = {3,3};
    int arr[] = twoSum(nums, 6);
    twoSum(nums,9);
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    // Map map =new HashMap();
    // map.put(5, 6);
    // System.out.println(map.containsKey(5));
}
}