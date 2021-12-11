#include<iostream>
#include<vector>
#include<algorithm>
#include<math.h>
using namespace std;

int binary(int arr[], int l,int r,int x){
    if (r>=l){
        int mid = l + (r-l)/2;
        if(arr[mid] == x)
            return mid;
        if(arr[mid] > x)
            return binary(arr, l, mid-1, x);
        return binary(arr, mid+1, r, x);
    }
    return 0;
}
int minAbsDifference(vector<int> &nums, int goal){
    int size = nums.size(), res = abs(goal);
    int arr1[size/2+1],arr2[size/2+1];
    for (int i = 0; i < size/2; i++){
        arr1[i] = nums.at(i);
        cout<<arr1[i]<<" ";
    }
    int size1 = sizeof(arr1)/sizeof(arr1[0]) , range1 = (1<<size1)-1;
    for (int i = 0; i <= range1; i++){
        int x=0, y=i, sum1 = 0;
    }
    

    cout<<endl;
    for (int i = size/2; i < size ; i++){
        arr2[i-size/2] = nums.at(i);
        cout<<arr2[i-size/2]<<" ";
    }
    int n = sizeof(arr2)/sizeof(arr2[1]);
    sort(arr2,arr2+n);
    
    return 0;
}

int main(){
    vector<int> nums{5,3,-1,7};
    int goal;
    cout << "enter goal- ";
    cin >> goal;
    cout<<minAbsDifference(nums,goal);
}
