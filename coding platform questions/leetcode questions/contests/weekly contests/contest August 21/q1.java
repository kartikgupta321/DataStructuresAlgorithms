class q1{
    public static void main(String[] args) {
        int initialEnergy = 1, initialExperience = 1;
        int energy[] = {1,1,1,1};
        int experience[] = {1,1,1,50};
        Solution obj = new Solution();
        System.out.println(obj.minNumberOfHours(initialEnergy, initialExperience, energy, experience));
    }
}
class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int hours = 0;
        for (int i = 0; i < experience.length; i++) {
            if(initialEnergy>energy[i] && initialExperience>experience[i]){
                initialEnergy -= energy[i];
                initialExperience += experience[i];
                continue;
            }
            if(initialEnergy<=energy[i]){
                hours += energy[i]-initialEnergy+1;
                initialEnergy =1;
            }
            if(initialExperience<=experience[i]){
                hours += experience[i]-initialExperience+1;
                initialExperience += experience[i]-initialExperience+1;
            }
            else if(initialEnergy<=energy[i] && initialExperience>experience[i]){
                initialExperience +=experience[i]-initialExperience+1;
            }
            System.out.println(initialEnergy+" "+initialExperience);
        }
        return hours;
    }
}