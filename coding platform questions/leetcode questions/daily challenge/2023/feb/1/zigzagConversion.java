import java.util.ArrayList;
import java.util.List;

public class zigzagConversion {
    public static void main(String[] args) {
        // String s = "PAYPALISHIRING";
        String s = "AB";
        Solution obj = new Solution();
        System.out.println(obj.convert(s, 1));
    }
}
// P     I    N
// A   L S  I G
// Y A   H R
// P     I
class Solution {
    public String convert(String s, int numRows) {
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(numRows==1) return s;
            if(counter == numRows){
                counter -= 2;
                while(counter>=0 && counter!=0){
                    list.get(counter).append(s.charAt(i));
                    i++;
                    if(i==s.length()) break;
                    counter--;
                }
                if(i==s.length()) break;
            }
            list.get(counter).append(s.charAt(i));
            counter++;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            ans.append(list.get(i));
            System.out.println(list.get(i));
        }
        return ans.toString();
    }
}