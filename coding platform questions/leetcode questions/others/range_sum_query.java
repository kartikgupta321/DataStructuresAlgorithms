public class range_sum_query {
    public static void main(String[] args) {
        int[] nums = { -2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        System.out.println(obj.sumRange(0, 2));
        System.out.println(obj.sumRange(2, 5));
        System.out.println(obj.sumRange(0, 5));
    }
}
class NumArray {
    int [] arr;
    public NumArray(int[] nums) {
        arr = nums;
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i]);
            arr[i] += arr[i-1];
        }
    }
    public int sumRange(int left, int right) {
        if(left==0) return arr[right];
        return arr[right] - arr[left-1];
    }
}