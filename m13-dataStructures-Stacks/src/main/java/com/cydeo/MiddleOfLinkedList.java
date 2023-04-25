package com.cydeo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MiddleOfLinkedList {

    public static void main(String[] args) {

        MySinglyLinkedList sll = new MySinglyLinkedList();
        for (int i = 1; i < 10; i++) {
            sll.add(i);
            System.out.println(i);
        }


//        printMiddleOfList(sll);

        printMiddleOfSLL(sll);


    }

    public static void printMiddleOfList(List<Integer> sll){

        int middle = -1;

        for (int  j = 0 ; j < sll.size(); middle++ , j+=2) {
//                System.out.println("i -> " + i + "\n j -> " + j);
        }

        System.out.println(sll.get(middle));

    }

    public static void printMiddleOfSLL(MySinglyLinkedList sll){
            // Create pointers
        Node slow = sll.head;
        Node fast = sll.head;

            //iterate until the fast pointer reaches the end of SLL
        while (fast != sll.tail && fast.next != sll.tail) {
            slow = slow.next;      // +1 ea iteration
            fast = fast.next.next; // +2 ea iteration
        }

        if (fast == sll.tail) System.out.println(slow.id);
        else System.out.println(slow.id);



    }


}
