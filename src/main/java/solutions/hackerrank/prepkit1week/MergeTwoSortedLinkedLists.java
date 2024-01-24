package solutions.hackerrank.prepkit1week;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Problem: https://www.hackerrank.com/challenges/one-week-preparation-kit-merge-two-sorted-linked-lists/
 * 
 * Given pointers to the heads of two sorted linked lists, merge them into a single, sorted linked list. Either head pointer may be null meaning that the corresponding list is empty.
 * 
 * Example:
 * headA refers to 1 --> 3 --> 7 --> NULL
 * headB refers to 1 --> 2 --> NULL
 * The new list is 1 --> 1 --> 2 --> 3 --> 7 -- NULL
 * 
 * Function Description
 * Complete the solution function in the editor below. 
 * solution has the following parameters:
 * 1. SinglyLinkedListNode pointer headA: a reference to the head of a list
 * 2. SinglyLinkedListNode pointer headB: a reference to the head of a list
 * Returns
 * 1. SinglyLinkedListNode pointer: a reference to the head of the merged list
 * 
 * Input Format
 * The first line contains an integer t, the number of test cases.
 * The format for each test case is as follows:
 * 1. The first line contains an integer n, the length of the first linked list.
 * 2. The next n lines contain an integer each, the elements of the linked list.
 * 3. The next line contains an integer m, the length of the second linked list.
 * 4. The next m lines contain an integer each, the elements of the second linked list.
 * 
 * Example: 
 * Input: head1= [1, 2, 3], head2= [3, 4]
 * Output: [1, 2, 3, 3, 4]
 */
public class MergeTwoSortedLinkedLists {
    /**
     * PSEUDO CODE video:
     * 
     * @param head1
     * @param head2
     * @return
     */
    public SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        List<Integer> list = new ArrayList<>();
        while (head1!=null) {
            list.add(head1.data);
            head1=head1.next;
        } // while: head1
        while (head2!= null) {
            list.add(head2.data);
            head2=head2.next;
        } // while: head2
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted List: "+ Arrays.toString(list.toArray()));

        SinglyLinkedList sllist = new SinglyLinkedList();
        for (int data: list) {
            // SinglyLinkedListNode n=new SinglyLinkedListNode(data);
            sllist.insertNode(data);
        } // for: data
        return sllist.head;
    }

    /*
     * Problem shared the below code
     */
    class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
    public void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

}
