#include<iostream>
using namespace std;
int tribonacci(int n) {
    int arr[38];
    arr[0]=0,arr[1]=1,arr[2]=1;
    for (int i = 3; i <=n ; i++){
        arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
    }
    return arr[n];
}
int main(){
    int n;
    cout<<"enter n for tribonacci no.-";
    cin>>n;
    cout<<tribonacci(n);
}