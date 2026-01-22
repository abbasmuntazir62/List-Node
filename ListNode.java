import java.util.*;

public class ListNode {
    int val;
    ListNode next; // Fixed typo

    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution { // Capitalized class name
    public ListNode removeNthFromEnd(ListNode head, int n) { // Fixed method signature
        if (head.next == null) {
            return null;
        }

        // size
        int size = 0;
        ListNode curr = head;
        while (curr != null) { // Fixed null check
            curr = curr.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        int indexToSearch = size - n; // Fixed variable name
        ListNode pre = head;
        int i = 1;
        while (i < indexToSearch) { // Fixed loop condition variable name
            pre = pre.next;
            i++;
        }

        pre.next = pre.next.next;
        return head; // Fixed return syntax
    }
}

public class MainApp {
    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(1,
                          new ListNode(2,
                            new ListNode(3,
                              new ListNode(4,
                                new ListNode(5)))));
        int n = 2;

        Solution sol = new Solution(); // Capitalized class name
        ListNode result = sol.removeNthFromEnd(head, n);

        // print list
        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
