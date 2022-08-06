import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class q2{
    public static void main(String[] args) {
        int N = 6;
        int []A = { -17,-17,17,-8,-13,8};
        Solution obj = new Solution();
        System.out.println(obj.maximumMultiple( N,  A));
    }
}
class Solution {
    public  long maximumMultiple(int N, int[] A) {
        // Arrays.sort(A);
        List<Integer>  a= new ArrayList<>();
        for (int i : A) {
            a.add( i);
        }
        a.sort(Comparator.comparingInt(Math::abs));
        List<Long> b = new ArrayList<>();
        while (a.size()>0) {
            Long prod=(long) 0;
            prod = (long) (a.get(a.size()-1) * a.get(0));
            a.remove(a.size()-1);
            a.remove(0);
            b.add(prod);
        }
        Collections.sort(b);
        return b.get(b.size()-1);
    }
}

// Long prod=(long) 0;
            // prod = (long) (a.get(a.size()-1) * a.get(a.size()/2 - 1));
            // a.remove(a.size()-1);
            // a.remove((a.size()+1)/2 - 1);
            // b.add(prod);



        // int j = A.length-1;
        // for (int i = 0; i < j; ) {
        //     Long prod=(long) 0;
        //     if(A[i]<=0){
        //         prod = (long) (A[i] * A[j]);
        //         b.add(prod);
        //         i++;
        //         j--;
        //         continue;
        //     }
        //     else{
        //         prod = (long) (A[i] * A[i+1]);
        //         b.add(prod);
        //         i +=2;
        //     }
        // }