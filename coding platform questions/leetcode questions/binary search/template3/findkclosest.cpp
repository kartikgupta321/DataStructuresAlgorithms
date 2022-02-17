#include<iostream>
#include<vector>
using namespace std;
vector<int> findClosestElements(vector<int>& arr, int k, int x) {
        int l=0,r=arr.size()-k;
        while (l<r){
            int mid = l + (r-l)/2;
            if (x-arr[mid]>arr[mid+k]-x){
                l = mid+1;
            }
            else
                r =mid;
        }
        vector<int> R = vector<int>(arr.begin()+l,arr.begin()+l+k);
        return R;
    }
int main(){
    vector<int> arr{1,2,3,4,5},R;
    R = findClosestElements(arr,4,4);
    for (int i = 0; i < R.size(); i++){
        cout<<R[i];
    }
    
}