class canPlaceFlowers{
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        
        Solution obj = new Solution();
        
        System.out.println(obj.canPlaceFlowers(flowerbed, 2));
    }
}
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int space = 0;
        if(n==0) return true;
        if(flowerbed.length==1 ){
            if(flowerbed[0]==0 && n<=1) return true;
            else return false;
        } 
        else{
        for (int i = 0; i < flowerbed.length; i++) {
            if(i!=0 && i!=flowerbed.length-1 && flowerbed[i]==0){
                if(i+1<flowerbed.length && i-1>=0 && flowerbed[i-1]==0 && flowerbed[i+1]==0 ){
                    flowerbed[i] = 1;
                    space++;
                }
            }
            else if(i==0 &&  flowerbed[i]==0 && i+1 <flowerbed.length && flowerbed[i+1]==0){
                flowerbed[i] = 1;
                    space++;
            }
            else if(i==flowerbed.length-1 && i-1>0 && flowerbed[i]==0 && flowerbed[i-1]==0){
                flowerbed[i] = 1;
                    space++;
            }
        }
        for (int i : flowerbed) {
            System.out.println(i);
        }
        System.out.println(space);
        if(space>=n) return true;
        return false;
        }
    }
}