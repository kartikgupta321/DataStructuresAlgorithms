
package linkedlist;

import java.util.Scanner;

public class LinkedListUse {
	
	public static HNode<Integer> createLL(){
		
		HNode<Integer> h = new HNode<>();
		
		HNode<Integer> h1 = new HNode<>(10);
		h.next1 = h1;
		HNode<Integer> h2 = new HNode<>(102);
		h.next2 = h2;
		HNode<Integer> h3 = new HNode<>(1551);
		h.next3 = h3;
		HNode<Integer> n1 = new HNode<>(12);
		h1.next1 = n1;
		HNode<Integer> n2 = new HNode<>(101);
		h2.next1 = n2;
		HNode<Integer> n3 = new HNode<>(1000);
		h3.next1 = n3;
		HNode<Integer> n4 = new HNode<>(1234);
		n3.next1 = n4;
		HNode<Integer> n5 = new HNode<>(3333);
		n4.next1 = n5;
		HNode<Integer> n6 = new HNode<>(4444);
		n5.next1 = n6;
		HNode<Integer> n7 = new HNode<>(5555);
		n6.next1 = n7;
		return h;
	}
	
	public static void printLL(HNode<Integer> head) {
		HNode<Integer> temp1 = head.next1;
		HNode<Integer> temp2 = head.next2;
		HNode<Integer> temp3 = head.next3;
		while(temp1 != null) {
			System.out.println(temp1.data);
			temp1 = temp1.next1;
		}
		System.out.println();
		
		while(temp2 != null) {
			System.out.println(temp2.data);
			temp2 = temp2.next1;
		}
		System.out.println();
		while(temp3 != null) {
			System.out.println(temp3.data);
			temp3 = temp3.next1;
		}
		System.out.println();
		
	}
	
	public static void incrementLL(HNode<Integer> head) {
		HNode<Integer> temp = head;
		while(temp != null) {
			temp.data++;
			temp = temp.next1;
		}
	}
	
	public static int lengthOfLL(HNode<Integer> head){
        HNode<Integer> temp = head;
        int count = 0;
        while(temp != null && temp.data != -1) {
			temp = temp.next1;
            count++;
		}
        return count;
	}
	
	public static void printIthNode(HNode<Integer> h, int i) {
		HNode<Integer> temp1 = h.next1;
		HNode<Integer> temp2 = h.next2;
		HNode<Integer> temp3 = h.next3;
        while(temp1 != null) {
        	if(temp1.data == i) {
        		System.out.println(i + " found");
        		break;
        	}
        	temp1 = temp1.next1;
        }
        while(temp2 != null) {
        	if(temp2.data == i) {
        		System.out.println(i + " found");
        		break;
        	}
        	temp2 = temp2.next1;
        }
        while(temp3 != null) {
        	if(temp3.data == i) {
        		System.out.println(i + " found");
        		break;
        	}
        	temp3 = temp3.next1;
        }
        
	}
	
	
	public static void main(String[] args) {
		HNode<Integer> head = createLL();
//		System.out.println(head.data);
//		System.out.println(head.next1.data);
		Scanner s = new Scanner(System.in);
		int val = s.nextInt();
		printLL(head);
		printIthNode(head, val);

	}

}

