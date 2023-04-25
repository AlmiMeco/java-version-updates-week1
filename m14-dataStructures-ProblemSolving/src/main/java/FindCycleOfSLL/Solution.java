package FindCycleOfSLL;

import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        ListNode n1=new ListNode(3);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(0);
        ListNode n4=new ListNode(4);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n2; // <- cycle


        System.out.println(hasCycle(n1));
    }

    private static boolean hasCycle(ListNode head) {
            // create hash-set
        HashSet<ListNode> visitedNodes = new HashSet<>();

            // set current to head
        ListNode current = head;

            // iterate the List until the end
        while (current != null){

                // if current is already contained in HashSet
            if (visitedNodes.contains(current)) return true;
                // if not add the elem to list
            visitedNodes.add(current);
                // continue to next Node
            current = current.next;

        }

        return false;
    }


}
