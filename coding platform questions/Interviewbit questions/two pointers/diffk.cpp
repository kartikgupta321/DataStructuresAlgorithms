#include<iostream>
#include<vector>
using namespace std;
int diffPossible(vector<int> &A, int B) {
    int j=0;
    for (int i = 0; i < A.size(); i++){
        j = max(j,i+1);
        while ( j<A.size() && A[j]-A[i]< B){
            j++;
        }
        if(A[j]-A[i] == B) return 1;
    }
    return 0;
}
int main(){
    vector<int> A{1, 3, 5,6};
    int B =4;
    cout<<diffPossible(A,B);
}