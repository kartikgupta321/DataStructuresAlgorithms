import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
        Allocator obj = new Allocator(10);
        System.out.println(obj.allocate(1, 1));
        
        System.out.println(obj.allocate(1, 2));
        
        System.out.println(obj.allocate(1, 3));
        
        System.out.println(obj.free(2));
        
        System.out.println(obj.allocate(3,4));
        for (Integer i : obj.array) {
            System.out.print(i+ " ");
        }
        System.out.println(obj.allocate(1,1));
        
        System.out.println(obj.allocate(1,1));
        System.out.println(obj.free(1));
        System.out.println(obj.allocate(10,2));
        System.out.println(obj.free(7));
    }
}
class Allocator {
    int[] array;
    public Allocator(int n) {
        array = new int[n];
    }
    public int allocate(int size, int mID) {
        for (int i = 0; i < array.length; i++) {
            int start = i, j=0;
            for ( j = 0; j < size; j++) {
                if(i+j>=array.length) break;
                if( array[i+j]==0) continue;
                else break;
            }
            if(j==size){
                Arrays.fill(array, start, start+j, mID);
                return start;
            }
        }
        return -1;
    }
    public int free(int mID) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==mID) {
                array[i] = 0;
                sum+=1;
            }
        }
        return sum;
    }
}