#include<iostream>
#include<vector>
using namespace std;
int maxSubArray(const vector<int> &A) {
    int res=0;
    for (int i = 0; i <= A.size(); i++){
        int sum=0;
        for (int j = i; j < A.size(); j++){
            sum += A.at(j);
            if (sum>res){
                res = sum;
            }
        }
    }
    return res;
}
int maxSubArray2(const vector<int> &A) {
    int max=A.at(0),curr=0;
    for (int i = 0; i < A.size(); i++){
        curr += A.at(i);
        if (curr<0){
            curr=0;
        }
        else if (curr>max){
            max = curr;
        }
    }
    return max;
}
int main(){
    vector<int> A ={-3,-8,4,6,-2,8};
    cout<<maxSubArray2(A);
}