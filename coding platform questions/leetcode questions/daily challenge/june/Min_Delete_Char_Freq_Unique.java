import java.util.Arrays;

public class Min_Delete_Char_Freq_Unique {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "bbcebab";
        System.out.println(obj.minDeletions(s));
    }
}
class Solution {
    public int minDeletions(String s) {
        int[] arr = new int[27];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int pos = s.charAt(i)-'a';
            arr[pos] +=1;
        }
        Arrays.sort(arr);
        for (int i = arr.length-1; i >0; i--) {
            if(arr[i]==0 && arr[i-1]==0 ) continue;
            else if(arr[i]>arr[i-1]) continue;
            else if(arr[i] == arr[i-1]) {
                ans++;
                arr[i-1]--;
            }
            else{
                ans++;
                arr[i-1]--;
                i++;
            }
        }
        return ans;
    }
}