#include<iostream>
using namespace std;
bool isBadVersion(int version){
    int bad =1;
    if(version >= bad){
        return true;
    }
    return false;
}
int firstBadVersion(int n) {
    int left = 1,right = n;
    while (left<right){
        int mid = left + (right-left)/2;
        if (isBadVersion(mid) == 1 && isBadVersion(mid-1)==0){
            return mid;
        }
        else if (isBadVersion(mid) ==0 ){
            left = mid+1;
        }
        else right = mid;
    }
    if(left== n && isBadVersion(left)==1) return left;
    return -1;   
}
int main(){
    cout<<firstBadVersion(1);
    }