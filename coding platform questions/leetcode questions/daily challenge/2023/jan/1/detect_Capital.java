class detect_Capital{
    public static void main(String[] args) {
        String word = "USA";
        Solution obj = new Solution();
        System.out.println(obj.detectCapitalUse(word));
    }
}
class Solution {
    public boolean detectCapitalUse(String word) {
        int capital = 0;
        for (int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))==true){
                capital++;
            }
        }
        if(capital==0) return true;
        if(capital==1 && Character.isUpperCase(word.charAt(0))==true) return true;
        if(capital==word.length()) return true;
        return false;
    }
}