import java.util.HashMap;

class q3{
    public static void main(String[] args) {
        int n = 4,k = 2;
        int arr[] = { 0,2,4,6};
        Solution obj = new Solution();
        System.out.println(obj.kthMex(n, k, arr));
    }
}
class Solution {
    int kthMex(int n, int k, int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, 1);
        }
        int key = 0;
        for (int i = 0; ; i++) {
            if(key == k) return i-1;

            else if(map.containsKey(i)){
                continue;
            }
            key += 1;
        }
    }
}