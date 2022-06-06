#include<iostream>
// #include<>
using namespace std;

struct listnode{
    int val;
    listnode* next;
    listnode(int x) : val(x), next(NULL){}
};

void print(){
    listnode *temp = head;
}
void push(int val){
    listnode * temp = new listnode(val);
    temp->next = head;
    head = temp;
}

int main(){
    cout<<NULL;

}

