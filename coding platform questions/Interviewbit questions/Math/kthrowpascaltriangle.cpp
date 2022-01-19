#include<iostream>
#include<vector>
#include<math.h>
using namespace std;
vector<int> getRow(int A) {
    vector<int> R;
    int ans=0;
    ans = pow(11,A);
    while (ans != 0){
        R.push_back(ans%10);
        ans = ans/10;
    }
    return R;

}
int main(){
    vector<int> C = getRow(3);
    for (int i = 0; i < C.size(); i++){
        cout<<C.at(i);
    }
    
}