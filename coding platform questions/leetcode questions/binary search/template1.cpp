#include<iostream>
#include<vector>
using namespace std;

    int search(vector<int>& nums, int target) {
        int left = 0, right= nums.size()-1 ,pivot;
        while (left<= right){
            pivot = left +( right -left )/2;
            if(target==nums.at(pivot)) return pivot;
            if( target > nums.at(pivot)) left = pivot+1;
            else right = pivot-1;
        }
        return -1;
    }
    int binarySearch(vector<int>& nums, int target){
        if(nums.size() == 0)
            return -1;
        int left = 0, right = nums.size() - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){ return mid; }
            else if(nums[mid] < target) { left = mid + 1; }
            else { right = mid - 1; }
        }
        return -1;
    }
    int main(){
    vector<int> nums{-1,0,3,5,9,12};
    cout<<search(nums,9);
    }


