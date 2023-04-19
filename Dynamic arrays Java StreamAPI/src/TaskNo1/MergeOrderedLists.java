package TaskNo1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 4/19/2023
 *
 * @author : Admin
 * @date : 4/19/2023
 * @project : Dynamic arrays Java StreamAPI
 */
public class MergeOrderedLists {
    public static Node mergeLists(Node list1, Node list2) {
        // create a dummy node to serve as the head of the merged list
        Node dummy = new Node(0);
        Node tail = dummy;

        // traverse both lists, comparing the nodes at each position
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                // append the smaller node to the merged list
                tail.next = new Node(list1.data);
                list1 = list1.next;
            } else {
                // append the smaller node to the merged list
                tail.next = new Node(list2.data);
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // append any remaining nodes from list1 or list2 to the merged list
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        // return the merged list, discarding the dummy node
        return dummy.next;
    }

    public static Node mergeListsInPlace(Node list1, Node list2) {
        // handle empty list cases
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        // determine the head of the merged list
        Node head;
        if (list1.data < list2.data) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        // merge the remaining nodes of both lists
        Node current = head;
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // append any remaining nodes from list1 or list2 to the merged list
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // clear the input lists by setting their head nodes to null
        list1 = null;
        list2 = null;

        // return the head of the merged list
        return head;
    }

    public static Node intersection(Node list1, Node list2) {
        // create a dummy node to serve as the head of the intersection list
        Node dummy = new Node(0);
        Node tail = dummy;

        // traverse both lists, comparing the nodes at each position
        while (list1 != null && list2 != null) {
            if (list1.data == list2.data) {
                // append the matching node to the intersection list
                tail.next = new Node(list1.data);
                list1 = list1.next;
                list2 = list2.next;
                tail = tail.next;
            } else if (list1.data < list2.data) {
                list1 = list1.next;
            } else {
                list2 = list2.next;
            }
        }

        // return the intersection list, discarding the dummy node
        return dummy.next;
    }




}
