#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
#include<math.h>
using namespace std;
vector<int> plusOne(vector<int> &A) {
    int n =A.size(),count=0;
    vector<int> R;
    for (int i = 0; i < n; i++){
        R.push_back(A.back());
        A.pop_back();
    }
    while (R.back()==0){
        R.pop_back();
    }
    int i;
    for ( i = 0; i < R.size(); i++){
        if (R.at(i) < 9){
            R.at(i) +=1;
            break;
        }
        else if (R.at(i) == 9){
            R.at(i) = 0;
        }
    }
    if (i==R.size()){
        A.push_back(1);
    }
    n = R.size();
    for (int i = 0; i < n; i++){
        A.push_back(R.back());
        R.pop_back();
    }
    return A;
}
int main(){
    vector<int> A={0, 3, 7, 6, 4, 0, 5, 5, 5 };
    plusOne(A);
    for (int i = 0; i < A.size(); i++){
        cout<<A.at(i);
    }
    
}