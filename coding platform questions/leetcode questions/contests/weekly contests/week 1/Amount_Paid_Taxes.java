class Amount_Paid_Taxes{
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] brackets = { {3,1},{4,25},{5,50} };
        int income = 2;
        System.out.println(obj.calculateTax(brackets, income));
    }
}
class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double tax=0;
        for (int i = 0; i < brackets.length; i++) {
            if(income == 0) return tax/100;
            else if(i==0 && income >= brackets[i][0]){
                tax += brackets[i][0]*brackets[i][1];
            }
            else if(i==0 && income < brackets[i][0]){
                tax += income*brackets[i][1];
                return tax/100;
            }
            else if(i>0 && brackets[i][0]<income){
                tax += ( brackets[i][0] - brackets[i-1][0] ) * brackets[i][1];
            }
            else if( brackets[i][0] > income){
                tax += ( income - brackets[i-1][0] ) * brackets[i][1];
                return tax/100;
            }
        }
        return tax/100;
    }
}