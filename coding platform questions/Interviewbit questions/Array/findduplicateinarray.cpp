#include<iostream>
#include<vector>
#include<string>
using namespace std;
int repeatedNumber(const vector<int> &A) {
    int n =A.size();
    vector<int> count(n+1,0);
    for (int i = 0; i < A.size(); i++){
        count.at(A.at(i)) += 1;
    }
    for (int i = 0; i < count.size(); i++){
        if (count.at(i)>1){
            return i;
        }
    }
    return -1;
}
int main(){
    vector<int> A{1,2,3,4,4};
    cout<<repeatedNumber(A);
}