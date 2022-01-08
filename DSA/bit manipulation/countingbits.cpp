#include<iostream>
#include<conio.h>
#include<vector>
using namespace std;
int main(){
    unsigned int n;
    cin>>n;
    vector<int> arr={0};
    // for (int i = 0; i < n+1; i++){
    //     int count=0;
    //     for(int j=0;j<32;j++){
    //         if((i>>j)&1){
    //             count+=1;
    //         }
    //     }
    //     arr.push_back(count);
    //     cout<<arr[i]<<endl;
    // }

    // OR
    for (int i = 1; i < n+1; i++){
        arr.push_back(arr[i>>1]+i%2);
        cout<<arr[i-1]<<endl;
    }

    



    return 0;
}