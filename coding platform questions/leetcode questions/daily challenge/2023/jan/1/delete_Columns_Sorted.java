public class delete_Columns_Sorted {
    public static void main(String[] args) {
        String[] strs = {"zyx","wvu","tsr"};
        Solution obj = new Solution();
        System.out.println(obj.minDeletionSize(strs));
    }
}
class Solution {
    public int minDeletionSize(String[] strs) {
        int[] index = new int[strs[0].length()];
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length-1; j++) {
                if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                    index[i]=1;
                    break;
                }
            }
        }
        int count = 0;
        for (int i : index) {
            if(i==1) count++;
        }
        return count;
    }
}

