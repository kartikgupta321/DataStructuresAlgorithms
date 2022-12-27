public class q2 {
    public static void main(String[] args) {
        String s = "aabaaaacaabc";
        Solution obj = new Solution();
        System.out.println(obj.takeCharacters(s, 2));
    }
}
class Solution {
    public int takeCharacters(String s, int k) {
        if(s.length()<k*3) return -1;
        if(s.length()==k*3) return s.length();
        int []arr = new int[3];
        int i =0,j=s.length()-1;
        int ans = 0;
        while(i!=j){
            if(arr[0]>2 && arr[1]>2 && arr[2]>2) return ans;
            if(s.charAt(i)==s.charAt(j)) i++;j--;arr[s.charAt(i)]++;ans++;
            else if()

        }
        return -1;
    }
}