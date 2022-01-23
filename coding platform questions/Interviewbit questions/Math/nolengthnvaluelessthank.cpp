#include<iostream>
#include<vector>
#include<algorithm>
#include<math.h>
using namespace std;
int solve(vector<int> &A, int B, int C) {
    int n=0,count=0;
    for (int i = 0; i < B-1; i++){
        n += 9*(pow(10,i));
    }
    cout<<n;
    for (int i = C-1; i > n ; i--){
        int r= i;
        while (r){
            if (find(A.begin(),A.end(),r%10) !=  A.end()){
                cout<<r<<" ";
                r= r/10;
                if(r==0) count +=1;
                continue;
            }
            else{
                break;
            }
        }
    }   
    return count;
}
int main(){
    vector<int> A{0 ,1, 5};
    cout<<solve(A,1,2);
}