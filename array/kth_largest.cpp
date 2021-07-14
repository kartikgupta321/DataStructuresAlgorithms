#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int findKthLargest(vector<int>& nums, int k){
    int n=nums.size();
    std::max_element(nums[0],n);





    return k;
}
int main(){
    // vector<int> nums{3,2,3,1,2,4,5,5,6};
    int nums[]={3,2,3,1,2,4,5,5,6};
    // findKthLargest(nums,5);
    int n=sizeof(nums)/sizeof(nums[0]);
    cout<<std::max_element(nums, nums + 4);

}