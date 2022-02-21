#include<iostream>
using namespace std;
bool isPerfectSquare(int num) {
    int l=0,r=num;
    while (l<=r){
        int mid = l + (r-l)/2;
        if(mid*mid == num) return true;
        else if(mid *mid >num) r=mid-1;
        else l=mid+1;
    }
    return false;
        
}
int main(){
    cout<<isPerfectSquare(2000105819);
}