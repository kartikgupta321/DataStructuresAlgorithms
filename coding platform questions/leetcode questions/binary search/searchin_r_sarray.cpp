#include<iostream>
#include<vector>
using namespace std;
int search(vector<int>& nums, int target) {
    int left=0,right=nums.size()-1,pivot=0;
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
    left=0,right=nums.size()-1;
    int mid;
    // if (pivot==0){
    //     left=0,right=nums.size()-1;
    //     while (left<=right){
    //         mid= left + (right-left)/2;
    //         if(nums.at(mid)==target) return mid;
    //         else if(nums.at(mid) < target) left=mid+1;
    //         else right = mid -1;
    //     }
    // }
    if(target<nums.at(left)){
        left=pivot+1,right=nums.size()-1;
        while (left<=right){
            mid= left + (right-left)/2;
            if(nums.at(mid)==target) return mid;
            else if(nums.at(mid) < target) left=mid+1;
            else right = mid -1;
        }
    }
    else{
        left=0,right=pivot;
        while (left<=right){
            mid= left + (right-left)/2;
            if(nums.at(mid)==target) return mid;
            else if(nums.at(mid) < target) left=mid+1;
            else right = mid -1;
        }
    }
    cout<<pivot;
    return -1;
}
int main(){
    vector<int> nums{3,1};
    cout<<search(nums,1);
}

