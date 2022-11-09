class max_69_no{
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.maximum69Number(9696));
    }
}
class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='6'){
                str.setCharAt(i, '9');
                String news = str.toString();
                return Integer.valueOf(news);            }
        }
        return num;
    }
}