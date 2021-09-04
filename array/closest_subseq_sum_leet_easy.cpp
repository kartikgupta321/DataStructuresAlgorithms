#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int minAbsDifference(vector<int> &nums, int goal){
    int size = nums.size();
    int abs = goal,range = (1 << size) - 1;
    for (int i = 0; i <= range; i++){
        int x = 0, y = i, sum = 0;
        while (y > 0){
            if (y & 1 == 1)
                sum = sum + nums[x];
            x++;
            y = y >> 1;
        }
        if(sum-goal==0){
            cout<<"0 ";
            return 0;
        }
        else if((sum-goal)>0 && (sum-goal)<abs){
            cout<<"abs";
            abs=sum-goal;
        }
    }
    return abs;
}
int main(){
    vector<int> nums{7,-9,15,-2};
    int goal;
    cout << "enter goal- ";
    cin >> goal;
    cout<<minAbsDifference(nums,goal);
}