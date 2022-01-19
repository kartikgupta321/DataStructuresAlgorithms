#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
vector<int> wave(vector<int> &A) {
    sort(A.begin(),A.end());
    for (int i = 0; i < A.size()-1; i=i+2){
        A.at(i) = A.at(i) + A.at(i+1);
        A.at(i+1) = A.at(i) - A.at(i+1);
        A.at(i) = A.at(i) - A.at(i+1);
    }
    return A;
}
int main(){
    vector<int> A ={4,3,2,1};
    wave(A);
    for (int i = 0; i < A.size(); i++){
        cout<<A.at(i);
    }
}