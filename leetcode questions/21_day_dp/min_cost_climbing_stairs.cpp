#include<iostream>
#include<vector>
using namespace std;
int minCostClimbingStairs(vector<int>& cost){
    int sum=0;

    for (int i = (cost.size()-1); i >= 0; i--){
        if (i==0 || i==1){
            return sum;
        }
        if (cost.at(i)>cost.at(i-1)){
            sum += cost[i-1];
            i=i-1;
        }
        else{
            sum += cost[i];
        }
        
    }
    return sum;
}
int main(){
    vector<int> cost;
    int n;
    cost = {1,100,1,1,1,100,1,1,100,1};
    cout<<minCostClimbingStairs(cost);
}