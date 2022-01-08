#include<iostream>
#include<conio.h>
#include<vector>
using namespace std;
int main(){
    vector<int> per;
    int enc[]={6,5,4,6};
    int n=sizeof(enc)/sizeof(enc[0]);
    cout<<"n is "<<n<<endl;

    int nxor= ((n/2) +1) %2;
    int mxor= enc[1];
    for (int i = 3; i < n; i+=2){
        mxor ^= enc[i];
    }
    cout<<"nxor and mxor is "<<nxor<<mxor<<endl;
    int x=nxor^mxor;
    per.push_back(x);
    for (int i = 0; i < n; i++){
        x  = x^enc[i];
        per.push_back(x);
    }

    
    for (int i = 0; i <per.size(); i++){
        cout<<per[i]<<endl;
    }

    return 0;
}