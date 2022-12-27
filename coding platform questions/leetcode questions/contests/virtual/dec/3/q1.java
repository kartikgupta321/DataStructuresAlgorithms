class q1{
    public static void main(String[] args) {
        String[] words = { "hello","i","am","leetcode","hello"};
        Solution obj = new Solution();
        System.out.println(obj.closetTarget(words, "hello", 1));
    }
}
class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int ans =Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            int min = Integer.MAX_VALUE;
            if(words[i].equals(target)){
                if(i==startIndex) return 0;
                if(i>startIndex){
                    min = Math.min(Math.abs(i-startIndex), startIndex + words.length-i);
                    System.out.println(Math.abs(i-startIndex)+ " "+(startIndex + words.length-i));
                }
                else{
                    min = Math.min(Math.abs(i-startIndex), i + words.length -startIndex);
                    System.out.println(Math.abs(i-startIndex)+ " "+(-startIndex + words.length+i));
                }
            }
            ans = Math.min(ans,min);
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}