#include<iostream>
#include<vector>
#include<string>
using namespace std;
void arrange(vector<int> &A) {
    for (int i = 0; i < A.size(); i++){
        A.at(i) = A.at(A.at(i));
    }  
}
int main(){
    vector<int> A{1,2,0};
    arrange(A);
    for (int i = 0; i < A.size(); i++){
        cout<<A.at(i);
    }
    
}