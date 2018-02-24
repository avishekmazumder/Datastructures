package com.avi.linkedlist;

import com.avi.model.Node;

/**
 * Created by Avishek on 09-Sep-17.
 */
public class SinglyLinkedList {
    Node head;

    public boolean ifLinkedListEmpty() {
        if(this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertAtFront(int data) {
        Node newNode = new Node(data,null);
        newNode.next = this.head;
        this.head = newNode;
    }

    /*
    Time complexity of append is O(n) where n is the number of nodes in linked list.
    Since there is a loop from head to end, the function does O(n) work.
    This method can also be optimized to work in O(1) by keeping an extra pointer to tail of linked list/
     */
    public void append(int data) {
        if(this.head == null) {
            this.head = new Node(data,null);
            return;
        }
        Node newNode = new Node(data, null);
        Node i = this.head;
        while(i.next!=null) {
            i=i.next;
        }
        i.next = newNode;
    }

    public void deleteElement(int n) {
        if(ifLinkedListEmpty()) {
            System.out.println("List is empty...");
            return;
        }

        Node prev=this.head, curr=this.head;

        while(curr!=null) {
            if(curr.data == n) {
                if(prev == curr) {
                    this.head = curr.next;
                } else {
                    prev.next = curr.next; //unlinking the node from linked list
                }
                System.out.println("Deleted element: "+ curr.data);
                return;
            }
            prev=curr;
            curr= curr.next;
        }

        System.out.println("Element not present...");
    }

    public void searchLinkedList(int data) {
        Node i = this.head;
        int count = 0;
        while(i!=null) {
            count++;
            if (i.data == data) {
                System.out.println("Element available at position:"+ count);
                return;
            }
            i=i.next;
        }
        if(count==0) {
            System.out.println("List is empty...");
        } else {
            System.out.println("Element not found");
        }
    }

    public int getNthNode(int index) {
        int count = 0 ;
        Node curr = this.head;

        while(curr!=null) {
            count++;
            if(index==count) {
                return curr.data;
            }
            curr = curr.next;
        }

        assert(false);
        return 0;
    }

    public void deleteFromEnd() {
        if(this.head == null) {
            System.out.println("List is empty");
            return;
        }
        /*
        When only one element is present in the linked list
         */
        if(this.head.next == null) {
            this.head = null;
            return;
        }

        /*
        When more than one element is present in the linked list
         */
        Node prev = this.head,curr = this.head;
        while(curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
    }

    public int recursiveCount(Node node) {
        if(node == null) {
            return 0;
        }
        return 1+ recursiveCount(node.next);
    }

    public int getCount(){
        return recursiveCount(this.head);
    }

    public void display() {
        String s="";
        for (Node i = this.head;i!=null;i=i.next) {
            if(i.next==null) {
                s=s+i.data;
            } else {
                s=s+i.data+" -> ";
            }
        }
        System.out.println(s);
    }
    
    public void insertAfter(int key,int data) {
    	
    	Node currNode = head;
    	Node prevNode = head;
    	
    	while(currNode!=null) { 
    		prevNode = currNode;
    		currNode = currNode.next;
       		if(prevNode.data == key) {
    			break;
    		}    		
    	}
    	Node newNode = new Node(data,null);
    	prevNode.next = newNode;
    	newNode.next = currNode;
    }
    
    public void removeDuplicates() {
    	Node temp = null;
    	
    	for(temp = head;temp.next!=null;temp=temp.next) {   
    		
    		for(Node temp1 = temp;temp1.next!=null;) {
    			if(temp.data == temp1.next.data) { // remove tempNext
    				temp1.next = temp1.next.next;
    			} else {
    				temp1 = temp1.next;
    			}
    		}
    	}
    	
    }
}
