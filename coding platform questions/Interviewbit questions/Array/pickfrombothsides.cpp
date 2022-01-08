#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int solve(vector<int> &A, int B) {
    int sum = 0;
    int n=A.size();
    int p[n],s[n];
    p[0] =A.at(0),s[0] =A.at(n-1);
    // for (int i = 0, j=0 ; i+j < B; ){
    //     if (A.at(i) > A.at(n-1-j)){
    //         sum += A.at(i);
    //         i +=1;
    //     }
    //     else{
    //         sum += A.at(n-1-j);
    //         j +=1;
    //     }
    // }
    for (int i = 1; i < n; i++){
        p[i] = A.at(i) +p[i-1];
        s[n-1-i] = A.at(n-1-i) + s[n-1];
    }
    for (int i = 0; i < n; i++){
        cout<<p[i]<<" ";
    }
    cout<<endl;
    for (int i = 0; i < n; i++){
        cout<<s[i]<<" ";
    }
    
    return sum;
}
int main(){
    vector<int> A{3,5,4,3};
    int B =2;
    cout<<solve(A,B);
}