import java.util.ArrayList;
import java.util.List;

public class letter_combinations_phone {
    public static void main(String[] args) {
        Solution obj = new Solution();
        List<String> list = new ArrayList<>();
        String digits = "23";
        list = obj.letterCombinations(digits);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                System.out.print(list.get(i).charAt(j));
            }
            System.out.println();
        }        
    }
}
class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();
        String[] dict = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> combos = new ArrayList<>();
        backtrack(combos, digits.toCharArray(), "" , dict);
        return combos;
    }
    public void backtrack(List<String> combos, char[] digits, String s, String[] dict){
        if(s.length()==digits.length) combos.add(s);
        else{
            int i = s.length();
            int digit = Integer.parseInt(String.valueOf(digits[i]));
            for (char letter : dict[digit].toCharArray()) {
                backtrack(combos, digits, s+ Character.toString(letter), dict);
            }
        }
    }
}
