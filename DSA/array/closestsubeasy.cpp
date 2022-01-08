#include <iostream>
#include <algorithm>
#include <vector>
#include <cstdlib>
using namespace std;

int minAbsDifference(vector<int> &nums, int goal){
    int size = nums.size();
    int res = abs(goal) ,range = (1 << size) - 1;
    for (int i = 0; i <= range; i++){
        int x = 0, y = i, sum = 0;
        while (y > 0){
            if (y & 1 == 1)
                sum = sum + nums[x];
            x++;
            y = y >> 1;
        }
        if(abs(sum-goal) < (res))
            res = abs(sum-goal);
    }   
    return abs(res);
}
int main(){
    vector<int> nums{5,-7,3,5};
    int goal;
    cout << "enter goal- ";
    cin >> goal;
    cout<<minAbsDifference(nums,goal);
}