#include<iostream>
#include<vector>
using namespace std;
int minCostClimbingStairs(vector<int>& cost){
    int first = cost[0],second = cost[1],n=cost.size();
    int arr[n];
    for (int i = 2; i < n-1; i++){
        
    }
    
}
int main(){
    vector<int> cost;
    int n;
    cost = {1,100,1,1,1,100,1,1,100,1};
    cout<<minCostClimbingStairs(cost);
}