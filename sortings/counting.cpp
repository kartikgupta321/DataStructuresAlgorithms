#include<iostream>
#include<conio.h>
#include<vector>
#include<algorithm>
#include<cstring>
using namespace std;
int main(){
    vector<int> arr={5,5,2,1,0,6,2,8};
    int n=*max_element(arr.begin(), arr.end());
    int a[n+1];
    memset(a,0,sizeof(a));
    for (int i = 0; i <arr.size(); i++){
        a[arr[i]]+=1;
    }
    int i=0,s=arr.size();
    while (s>0){
        if (a[i]==0){
            i=i+1;
            continue;
        }
        cout<<i;
        a[i]-=1;
        s-=1;
    }
    

    return 0;
}