#include<iostream>
#include<vector>
#include<map>
using namespace std;
void setZeroes(vector<vector<int> > &A) {
    map<int,int>c,r;
    for (int i = 0; i < A.size(); i++){
        for (int j = 0; j < A.at(0).size(); j++){
            if (A[i][j]==0){
                c[j]=1;
                r[i]=1;
            }
        }
    }
    for (int i = 0; i < A.size(); i++){
        for (int j = 0; j < A.at(0).size(); j++){
            if (c[j]==1 || r[i]==1){
                A[i][j]= 0;
            }
        }
    }
}
int main(){
    vector<vector<int>> A ={ { 1, 0, 1} ,{1,1,1},{1, 0, 1}  };
    setZeroes(A);
    for (int i = 0; i < A.size(); i++){
        for (int j = 0; j < A.at(0).size(); j++){
            cout<<A[i][j];
        }
        cout<<endl;
    }
    
}