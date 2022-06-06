class linked_list{
    Node head;    
    Node head1;
    Node left;
    Node right;
    class Node{
        int data;
        
        Node next;
        Node(int d) {data =d; next =null; }
    }
    void find_length(Node head){
        if(head==null){
            System.out.println("length = 0");
        }
        int length =0;
        while(head.next !=null){
            length++;
            head = head.next;
        }
        System.out.println("\n"+"length = "+ (length+1));
    }
    void printlist(Node head){
        if(head==null){
            System.out.println("empty");
            return;
        }
        while(head.next != null){
            System.out.print(head.data);
            System.out.print("->");
            head = head.next;
        }
        System.out.print(head.data);
        return;
    }
    public boolean search(Node head, int x)
    {
        Node current = head;    //Initialize current
        while (current != null)
        {
            if (current.data == x)
                return true;    //data found
            current = current.next;
        }
        return false;    //data not found
    }
    void addition(int new_data){
        Node new_node= new Node(new_data);

        if(head==null){
            head = new_node;
            return;
        }
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        last.next = new_node;
        return;
    }
    public static void main(String[] args) {
        int count=0;
        linked_list list2 = new linked_list();
        linked_list list3 = new linked_list();
        linked_list list4 = new linked_list();
        linked_list list = new linked_list();
        
        int arr[]={10,12,102,101,1551,1000,1234,11,24,4444};
        for (int i = 0; i < arr.length; i++) {
            int digit=0;
            int data =arr[i];
            while(arr[i]!=0){
                arr[i]=arr[i]/10;
                digit++;
            }
            // System.out.println("digit"+digit);
            if(digit==2){
                list2.addition(data);
            }
            else if(digit==3){
                list3.addition(data);
            }
            else if(digit==4){
                list4.addition(data);
            }
        }        
        list2.printlist(list2.head);
        System.out.println(" ");
        list3.printlist(list3.head);
        System.out.println(" ");
        list4.printlist(list4.head);
        System.out.println(" ");
        System.out.println(list2.search(list2.head, 10));
        

        list.printlist(list.head1);
    }
}