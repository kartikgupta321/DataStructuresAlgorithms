#include<iostream>
using namespace std;
int climbStairs(int n){
    int arr[30];
    arr[1] = 1,arr[0] = 0;
    for (int i = 2; i <= n+1; i++){
        arr[i] = arr[i-1] + arr[i-2];
    }
    return arr[n+1];
}
int main(){
    int n;
    cout<<"enter n for fibonacci number-";
    cin>>n;
    cout<<climbStairs(n);
}