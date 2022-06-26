public class q2 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[]nums1={60,60,60};
        int[] nums2 ={10,90,10};
        System.out.println(obj.maximumsSplicedArray(nums1, nums2));
    }
}
class Solution {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int[] diff = new int[nums1.length];
        int sum1=0,sum2=0;
        for (int i = 0; i < diff.length; i++) {
            sum1+=nums1[i];
            sum2+=nums2[i];
            diff[i] = nums1[i]-nums2[i];
        }
        int pos=diff[0],neg=diff[0];
        int curr1=diff[0],curr2=diff[0];
        for (int i = 1; i < diff.length; i++) {
            if (curr1 > 0) curr1 =0;
            if(curr2 < 0) curr2 = 0;
            curr1+=diff[i];
            curr2+=diff[i];
            neg = Math.min(neg, curr1);
            pos = Math.max(pos, curr2);
        }
        if(sum1 < sum2 && pos > (-1)*neg) return sum2+pos;
        System.out.println(sum1+neg);
        return sum1+ (-1)*neg; 
    }
}