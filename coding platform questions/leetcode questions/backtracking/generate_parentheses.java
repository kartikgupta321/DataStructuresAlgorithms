import java.util.ArrayList;
import java.util.List;

public class generate_parentheses {
    public static void main(String[] args) {
        Solution obj = new Solution();
        List<String> list = obj.generateParenthesis(3);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                System.out.print(list.get(i).charAt(j));
            }
            System.out.println();
        }
    }
}
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        backtrack(ans,new StringBuilder(),0,0,n);
        return ans;
    }
    public void backtrack(List<String> ans, StringBuilder cur, int open , int close, int max){
        if(cur.length() == max*2){
            ans.add(cur.toString());
            return;
        }
        if(open<max){
            cur.append("(");
            backtrack(ans, cur, open+1, close, max);
            cur.deleteCharAt(cur.length()-1);
        }
        if(close<open){
            cur.append(")");
            backtrack(ans, cur, open, close+1, max);
            cur.deleteCharAt(cur.length() -1);
        }
    }
}