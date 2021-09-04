#include<iostream>
using namespace std;

void merge(int array[],int const left,int const mid, int const right){
    auto const subArrayOne=mid-left+1;
    auto const subArrayTwo=right-mid;

    auto *leftArray=new int[subArrayOne];
    auto *rightArray=new int[subArrayTwo];

    for (auto i = 0; i < subArrayOne; i++)
        leftArray[i]=array[left+i];
    for (auto i = 0; i < subArrayTwo; i++)
        rightArray[i]=array[mid+1+i];
    
    auto indexOfSubArrayOne=0,indexOfSubArrayTwo=0;
    int indexOfMergedArray=left;

    while (indexOfSubArrayOne<subArrayOne && indexOfSubArrayTwo<subArrayTwo){
        if (leftArray[indexOfSubArrayOne]<=rightArray[indexOfSubArrayTwo]){
            array[indexOfMergedArray]=leftArray[indexOfSubArrayOne];
            indexOfSubArrayOne++;
        }
        else{
            array[indexOfMergedArray]=rightArray[indexOfSubArrayTwo];
            indexOfSubArrayTwo++;
        }
        indexOfMergedArray++;
    }

    while (indexOfSubArrayOne<subArrayOne){
        array[indexOfMergedArray]=leftArray[indexOfSubArrayOne];
        indexOfSubArrayOne++;
        indexOfMergedArray++;
    }
    while (indexOfSubArrayTwo<subArrayTwo){
        array[indexOfMergedArray]=rightArray[indexOfSubArrayTwo];
        indexOfSubArrayTwo++;
        indexOfMergedArray++;
    }    
}
void mergesort(int array[],int const begin, int const end){
    if(begin>=end)
        return;
    auto mid= begin+ (end-begin)/2;
    mergesort(array,begin,mid);
    mergesort(array,mid+1,end);
    merge(array,begin,mid,end);
}
void printArray(int A[],int size){
    for (int i = 0; i < size; i++){
        cout<<A[i]<<" ";
    }
}
int main(){
    int arr[]={12, 11, 13, 5,-6};
    int n=sizeof(arr)/sizeof(arr[1]);
    cout<<"given array- \n";
    printArray(arr,n);
    mergesort(arr,0,n-1);
    cout<<"\nsorted array- \n";
    printArray(arr,n);
    return 0;
}