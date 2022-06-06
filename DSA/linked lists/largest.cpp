#include<iostream>
using namespace std;

int main(){
    int arr[] = {1,2,3,4,5,6};
    int max=arr[0],max2= arr[0];

    for (int i = 0; i < 6; i++){
        if(arr[i] > max) {
            max=arr[i];
            max2 = max;
        }
        if (arr[i]>max2 && arr[i]<max){
            max2= arr[i];
        }
    }
    cout<<"max is - "<<max<<"  max2 is -"<<max2;

    return 0;

    
        

}