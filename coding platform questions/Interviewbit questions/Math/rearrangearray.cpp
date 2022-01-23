#include<iostream>
#include<vector>
#include<string>
using namespace std;
void arrange(vector<int> &A) {
    int n =A.size();
    for (int i = 0; i < n; i++){
        A.at(i) = A.at(i) + (A.at(A.at(i))%n)*n;
    }  
    for (int i = 0; i < n; i++){
        A.at(i) = A.at(i)/n;
    }
    
}
int main(){
    vector<int> A{4,2,3,1,0};
    arrange(A);
    for (int i = 0; i < A.size(); i++){
        cout<<A.at(i);
    }
    
}