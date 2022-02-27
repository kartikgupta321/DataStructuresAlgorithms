#include<iostream>
#include<vector>
#include<utility>

using namespace std;
void sortColors(vector<int> &A) {
    int red =0,color=0,blue=A.size()-1;
    while (color<=blue){
        if(A[color]==0) { 
            swap(A[red++],A[color++]);
        }
        else if(A[color] == 2){
            swap(A[blue--],A[color]);
        }
        else{
            color++;
        }
    }
}
int main(){
    vector<int> A{0,1,2,0,1,2};
    sortColors(A);
    for (int i = 0; i < A.size(); i++){
        cout<<A[i];
    }
    

}