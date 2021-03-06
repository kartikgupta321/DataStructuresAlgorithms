#include<iostream>
#include<vector>
using namespace std;
int findPeakElement(vector<int>& nums) {
    if(nums.size()==1 || nums.at(0)>nums.at(1)){
        return 0;
    }
    else if(nums.at(nums.size()-1) > nums.at(nums.size()-2)){
        return nums.size()-1;
    }
    int left=0,right = nums.size()-1,pivot;
    while (left<right ) {
        pivot= left + (right-left)/2;
        if(nums.at(pivot) > nums.at(pivot+1)) right =pivot;
        else left = pivot +1;
    }
    return left;
}
int main(){
    vector<int> nums{3,4,3,2,1};
    cout<<findPeakElement(nums);
}