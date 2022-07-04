public class q3 {
    public static void main(String[] args) {
        int n=6, delay=2, forget=4;
        Solution obj = new Solution();
        System.out.println(obj.peopleAwareOfSecret(n, delay, forget));
    }
}
class Solution {
    int ans = 1;
    int count = 1;
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int[][] people = new int[1000][2];
        people[0][0] =1;
        people[0][1] =1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < people.length; j++) {
                if (people[j][0]>2 && people[j][1]<4) {
                    people[count][0] = 1;
                    people[count][1] = 1;
                    ans++;
                }
                people[j][0]++;
                people[j][1]++;
            }
        } 
        return ans;
    }
}