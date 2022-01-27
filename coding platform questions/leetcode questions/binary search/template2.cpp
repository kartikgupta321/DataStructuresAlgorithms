#include<iostream>
#include<vector>
using namespace std;
int binarySearch(vector<int>& nums, int target){
    if(nums.size() == 0)    return -1;
    int left = 0, right = nums.size();
    while(left < right){
        int mid = left + (right - left) / 2;
        if(nums[mid] == target) return mid; 
        else if(nums[mid] < target) { left = mid + 1; }
        else { right = mid; }
    }
    // Post-processing:
    // End Condition: left == right
    if(left != nums.size() && nums[left] == target) return left;
    return -1;
}
int main(){
    vector<int> nums{-1,0,3,5,9,12};
    cout<<binarySearch(nums,9);
    }