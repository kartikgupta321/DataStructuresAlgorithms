class design_hashmap{
    class Listnode{
        int key,val;
        Listnode next;
        Listnode(int x, int y , Listnode n){
            key = x ;
            val = y;
            next = n;
        }
    }
    class MyhashMap{
        int size= 19997;
        int mult = 104729;
        Listnode data;

    }
}