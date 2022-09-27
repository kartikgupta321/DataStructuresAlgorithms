class Satisfiability_Equations{
    public static void main(String[] args) {
        String[] equations = { "a==b","b==a","c==a"};
        Solution obj = new Solution();
        System.out.println(obj.equationsPossible(equations));
    }
}
class Solution {
    int[] uf = new int[26];
    public boolean equationsPossible(String[] equations) {
        for (int i = 0; i < 26; i++) uf[i] = i;
        for (String e : equations) {
            if(e.charAt(1)=='='){
                uf[find(e.charAt(0)-'a')] = find(e.charAt(3) - 'a');
            }
        }
        for (String e : equations) {
            if(e.charAt(1)=='!' && find(e.charAt(0)-'a')==find(e.charAt(3)-'a')){
                return false;
            }
        }
        return true;
    }
    int find(int x){
        if(x!=uf[x]) uf[x] = find(uf[x]);
        return uf[x];
    }
}