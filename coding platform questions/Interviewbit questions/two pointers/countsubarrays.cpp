#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

int solve(vector<int> &A, int B) {
    int count=0,sum=A[0];
    for (int i=0,j = 0;i< A.size(); ){
        cout<<sum<<" "<<i<<" "<<j<<endl;
        if(sum<B) {
            count++,j++;
            sum += A[j];
        }
        else {
            sum -= A[i];
            i++;
        }
    }
    return count;
}
int main(){
    vector<int> A{1, 11, 2, 3, 15};
    int B =10;
    cout<<solve(A,B);
}