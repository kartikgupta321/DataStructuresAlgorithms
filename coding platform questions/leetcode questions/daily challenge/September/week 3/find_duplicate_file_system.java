import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class find_duplicate_file_system{
    public static void main(String[] args) {
        String[] paths={"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        Solution obj = new Solution();
        List<List<String>> ans = obj.findDuplicate(paths);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String,List<String>> map = new HashMap<>();        
        for(String path : paths){
            String[] values = path.split(" ");
            for (int i = 1; i < values.length; i++) {
                String[] name_cont = values[i].split("\\(");
                name_cont[1] = name_cont[1].replace(")", "");
                List<String> list = map.getOrDefault(name_cont[1], new ArrayList<String>());
                list.add(values[0]+"/"+ name_cont[0]);
                map.put(name_cont[1], list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (String key : map.keySet()) {
            if(map.get(key).size() >1){
                res.add(map.get(key));
            }
        }
        return res;
    }
}