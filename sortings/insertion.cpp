#include<iostream>
#include<conio.h>
using namespace std;
int main(){
    int arr[]={5,4,3,2,10};
    int n=sizeof(arr)/sizeof(arr[1]);
    for (int i = 1; i <= n; i++){
        for (int j = i; j >0; j--){
            if (arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
    }
    for (int i = 0; i < n; i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}