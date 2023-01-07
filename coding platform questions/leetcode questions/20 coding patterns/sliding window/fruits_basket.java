import java.util.HashMap;

class fruits_basket{
    public static void main(String[] args) {
        int[] fruits = {1,2,3,4,4,4,3};
        Solution obj = new Solution();
        System.out.println(obj.totalFruit(fruits));
    }
}
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int i = 0, j;
        for (j = 0; j < fruits.length; j++) {
            for (int c : count.keySet()) {
                System.out.print(c+ " "+count.get(c) +" ");
            }
            System.out.println();
            count.put(fruits[j], count.getOrDefault(fruits[j], 0) + 1);
            if (count.size() > 2) {
                count.put(fruits[i], count.get(fruits[i]) - 1);
                count.remove(fruits[i++], 0);
            }
        }
        return j - i;
    }
}