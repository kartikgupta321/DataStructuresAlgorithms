#include<iostream>

using namespace std;
struct listnode{
    int val;
    listnode *next;
};
void print(listnode* n){
    while(n!= NULL){
        cout<< n->val<<" ";  
        n=n->next;  
    }
}
listnode* reverselist(listnode* A){
    listnode *temp;
    listnode *curr;
    listnode *prev;
    temp = A->next->next;
    curr = A->next;
    prev = A;

    A->next =NULL;

    curr->next =prev;
    prev =curr;
    curr= temp;

    curr->next =prev;
    return curr;
}
int main(){
    listnode *head = NULL;
    listnode *second = NULL;
    listnode *third = NULL;

    head = new listnode();
    second = new listnode();
    third = new listnode();
     
    head->next = second;
    head->val = 1;

    second->next = third;
    second->val =2;

    third->next = NULL;
    third->val =3;
    print(reverselist(head));
}