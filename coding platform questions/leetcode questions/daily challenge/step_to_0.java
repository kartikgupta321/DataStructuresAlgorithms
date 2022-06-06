class step_to_0{
    public static int numberOfSteps(int num) {
        int steps =0;
        while(num!=0){
            if(num%2==0){
                num = num/2;
                steps = steps+1;
            }
            else{
                steps +=1;
                num -=1;
            }
        }
        return steps;
        }
    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));

    }
}