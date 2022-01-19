#include<iostream>
#include<vector>
using namespace std;
int solve(vector<int> &A) {
    int max=A.at(0),min = A.at(0);
    for (int i = 0; i < A.size(); i++){
        if (A.at(i) > max){
            max =A.at(i);
        }
        if (A.at(i) < min){
            min =A.at(i);
        }
    }
    return max+min;
}
int main() {
    vector<int> A={1, 3, 4, 1};
    cout<<solve(A);

}