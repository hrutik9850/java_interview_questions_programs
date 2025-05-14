package LeedCode;

// Definition for singly-linked list.
class ListNode {    // singly-linked list node
    int val;    // value of the node
    // next pointer to the next node in the list
    ListNode next;
    ListNode(int x) { val = x; } // constructor to initialize the node with a value
}


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);   // dummy head to simplify the code
        // current node in the result list
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {    // loop until both lists are processed and no carry left
            // get the values from the current nodes of l1 and l2, or 0 if the list is null
            int x = (l1 != null) ? l1.val : 0;  // value from l1
            int y = (l2 != null) ? l2.val : 0;  // value from l2
            // calculate the sum of the two digits and the carry
            // sum = carry + x + y
            int sum = carry + x + y;
            carry = sum / 10;   // update carry for the next iteration
            // create a new node with the digit value (sum % 10) and add it to the result list
            curr.next = new ListNode(sum % 10); // create a new node with the digit value
            // move the current pointer to the next node in the result list
            curr = curr.next;   // move to the next node
            // move to the next nodes in l1 and l2, if they exist
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
    }
}

public class Add_TwoNumber {
    public static void main(String[] args) {
        // Create first number: 342 as 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Create second number: 465 as 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Call the method
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
    }
}

