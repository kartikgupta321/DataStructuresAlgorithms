public class q2 {
    public static void main(String[] args) {
        String s = "dztz";
        int[][] shifts = { {0,0,0},{1,1,1}};
        Solution obj = new Solution();
        System.out.println(obj.shiftingLetters(s, shifts));
        // System.out.println((int)'z');
    }
}
class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        StringBuilder str =  new StringBuilder(s);
        for (int i = 0; i < shifts.length; i++) {
            for (int j = shifts[i][0]; j <= shifts[i][1]; j++) {
                if(shifts[i][2]==0){
                    if(str.charAt(j)-1==96) {
                        str.setCharAt(j, (char)122);
                        continue;
                    }
                    str.setCharAt(j, (char)(str.charAt(j)-1));
                }
                else{
                    if(str.charAt(j)+1==123) {
                        str.setCharAt(j, (char)97);
                        continue;
                    }
                    str.setCharAt(j, (char)(str.charAt(j)+1));
                }
            }
        }
        return str.toString();
    }
}
