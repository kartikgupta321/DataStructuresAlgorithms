#include<iostream>
#include<conio.h>
#include<array>
using namespace std;
int main(){
    int arr[]={5,4,3,2,1};
    int n=sizeof(arr)/sizeof(arr[1]);
    while (n>0){
        int count=0;
        for (int i = 0; i < n-1; i++){
             if (arr[i]>arr[i+1]){
                count=1;
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }  
        }
        if (count==0){
            break;
        }        
        n-=1;
    }
    for (int i = 0; i < sizeof(arr)/sizeof(arr[1]); i++){
        cout<<arr[i]<<" ";
    }
    
    return 0;
}