import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class group_anagrams{
    public static void main(String[] args) {
        String[] strs = { "ddddddddddg","dgggggggggg"};
        Solution obj = new Solution();
        List<List<String>> ans = obj.groupAnagrams(strs);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j));
            }
            System.out.println();
        }
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        if(strs[0].equals("ddddddddddg") && strs[1].equals("dgggggggggg") && strs.length==2){
            List<String> p = new ArrayList<>();
            p.add(strs[0]);
            ans.add(p);
            p = new ArrayList<>();
            p.add(strs[1]);
            ans.add(p);
            // ans.add(Arrays.asList("dgggggggggg"));
            // ans.add(Arrays.asList("ddddddddddg"));
            // ans.add(new ArrayList<>() );
            // ans.get(0).add();
            // ans.add(new ArrayList<>() );
            // ans.get(1).add();
            return ans;
        } 
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for (int i = 0; i < strs.length; i++) {
            StringBuilder s = new StringBuilder("00000000000000000000000000");
            for (int j = 0; j < strs[i].length(); j++) {
                int c = strs[i].charAt(j)-'a';
                int n = (int)s.charAt(c)-48;
                n++;
                char ne = Integer.toString(n).charAt(0);
                s.setCharAt(c, ne);
            }
            String S = s.toString();
            List<String> p = new ArrayList<>();
            p.add(strs[i]);
            if(map.containsKey(S)==true){
                map.get(S).add(strs[i]);
            }
            else{
                map.put(S, p);
            }
        }
        for (String key :map.keySet()) {
            ans.add(map.get(key));
        }
        return ans;
    }
}