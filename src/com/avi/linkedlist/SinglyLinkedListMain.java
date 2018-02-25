package com.avi.linkedlist;

import java.util.Scanner;

/**
 * Created by Avishek on 09-Sep-17.
 * Adding comment to test git branching
 */
public class SinglyLinkedListMain {

    public static void main(String args[]) throws Exception{

        System.out.println("*****************Linked List console****************");
        SinglyLinkedList linkedList = new SinglyLinkedList();
        while (true) {
            System.out.println("Enter choice...");
            System.out.println("1.Append to linkedlist");
            System.out.println("2.Delete from end at linkedlist");
            System.out.println("3.Search a value in linkedlist");
            System.out.println("4.Delete element from linkedlist");
            System.out.println("5.Insert element at beginning");
            System.out.println("6.Get count of linkedlist");
            System.out.println("7.Get Nth node of linkedlist");
            System.out.println("9.Display Linkedlist");
            System.out.println("8. Insert element after given key");
            System.out.println("8. Insert element after given key");
            System.out.println("11. Remove duplicates from linked list");
            System.out.println("10.Exit");

            Scanner scan = new Scanner(System.in);
            int n=scan.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter nos to be appended to linked list. Enter Q/q to exit");
                    int data;
                    while(true) {
                        String s = scan.next();
                        try {
                            data = Integer.parseInt(s);
                            linkedList.append(data);
                        } catch (Exception e) {
                            break;
                        }
                    }
                    linkedList.display();
                    break;

                case 2:
                    linkedList.deleteFromEnd();
                    break;

                case 3:
                    System.out.println("Enter the value to search...:");
                    int val = scan.nextInt();
                    linkedList.searchLinkedList(val);
                    break;

                case 4:
                    System.out.println("Enter the value to search...:");
                    int val4 = scan.nextInt();
                    linkedList.deleteElement(val4);
                    break;

                case 5 :
                    System.out.println("Enter the value to insert...:");
                    int val5 = scan.nextInt();
                    linkedList.insertAtFront(val5);
                    break;

                case 6:
                    System.out.println(linkedList.getCount());
                    break;

                case 7:
                    System.out.println("Enter the index...:");
                    int val7 = scan.nextInt();
                    System.out.println(linkedList.getNthNode(val7));
                    break;
                    
                case 8:
                	System.out.println("Enter the key...:");
                    int key = scan.nextInt();
                    System.out.println("Enter the value...:");
                    int data1 = scan.nextInt();
                    
                    linkedList.insertAfter(key, data1);
                    linkedList.display();
                    break;
                case 9:
                    linkedList.display();
                    break;
                    
                case 11:
                	linkedList.removeDuplicates();
                	break;
                case 10:
                    break;

                default:
                    System.out.println("Invalid Input...retry");
                    Thread.sleep(4000);
                    System.out.println();
            }
            if(n==10) {
                break;
            }
        }
    }
}