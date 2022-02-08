#include<iostream>
#include<vector>
using namespace std;
vector<int> searchRange(vector<int>& nums, int target) {
    vector<int> r{-1,-1};
    for (int i = 0; i < 2; i++){
        cout<<r.at(i);
    }
    return r;
        
}
int main(){
    vector<int> nums{3,1};
    searchRange(nums,5);
}