public class running_1d_arr_sum {
    public static int[] runningSum(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i]=  sum;          
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,5,6,9};
        int [] arr = runningSum(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
