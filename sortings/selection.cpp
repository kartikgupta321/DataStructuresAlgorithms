#include<iostream>
#include<conio.h>
using namespace std;
int main(){
    int arr[]={-9,5,4,3,20,100};
    int n=sizeof(arr)/sizeof(arr[1]);
    while (n>1){
        int l=0;
        for (int i = 1; i <= n; i++){
            if (arr[i]>arr[l]){
                l=i;
            }   
        }
        int temp=arr[l];
        arr[l]=arr[n];
        arr[n]=temp;
        --n;
    }
    for (int i = 0; i <sizeof(arr)/sizeof(arr[1]) ; i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}