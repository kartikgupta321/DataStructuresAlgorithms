#include<iostream>
#include<vector>
using namespace std;
int findMin(vector<int>& nums) {
    int left=0,right=nums.size()-1,pivot=-1;
    while(left<right){
        int mid=left + (right-left)/2;
        if(mid>left && nums.at(mid)<nums.at(mid-1)){
            pivot = mid-1;
            break;
        } 
        else if(mid<right && nums.at(mid)>nums.at(mid+1)){
            pivot = mid;
            break;
        } 
        else if(nums.at(mid) >nums.at(left) ){
            left = mid+1;
        }
        else right=mid-1;
    }
    return nums.at(pivot+1);
}
int main(){
    vector<int> nums{4,5,6,7,0,1,2};
    cout<<findMin(nums);
}