#include<iostream>
using namespace std;
int mySqrt(int x) {
    if(x<1) return x;
    long long left=0, right= x,pivot,ans;
    while (left<=right){
        pivot = left + (right-left)/2;
        if(pivot*pivot == x) return pivot;
        else if(pivot*pivot < x){
            ans = pivot;
            left = pivot+1;
        }
        else{
            right = pivot-1;
        };           
    }
    return ans;
}
int main(){
    cout<<mySqrt(4);
}    
    