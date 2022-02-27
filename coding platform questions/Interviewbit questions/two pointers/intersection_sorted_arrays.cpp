#include<iostream>
#include<vector>
using namespace std;
vector<int> intersect(const vector<int> &A, const vector<int> &B) {
    vector<int> R;
    for (int i = 0,j=0; i < A.size() && j < B.size() ; ){
        if (A[i] == B[j]){
            R.push_back(A[i]);
            i+=1;
            j+=1;
        }
        else if(A[i] < B[j]){
            i+=1;
        }
        else{
            j=j+1;
        }
    }
    return R;
    
}
int main(){
    vector<int> A{1,2,3,3,4,5,6};
    vector<int> B{3,5};
    vector<int> C;
    C= intersect(A,B);
    for (int i = 0; i < C.size(); i++){
        cout<<C[i];
    }
    
}