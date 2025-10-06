package LinkList;

// Node class for LinkedList
class ListNode {
    int val;            // Value of the node
    ListNode nextNode;  // Reference to the next node

    ListNode(int value) {
        this.val = value;
    }
}

public class LinkListImplementation {
    public static void main(String[] args) {
        // Step 1: Create initial linked list manually
        ListNode head = new ListNode(10);
        head.nextNode = new ListNode(20);
        head.nextNode.nextNode = new ListNode(50);
        head.nextNode.nextNode.nextNode = new ListNode(100);

        System.out.println("Original List:");
        printList(head);

        // Step 2: Insert at head (beginning of list)
        head = insertNodeAtFirst(head, 4444);
        System.out.println("\nAfter inserting 4444 at head:");
        printList(head);

        // Step 3: Insert at tail (end of list)
        insertNodeAtLast(head, 5555);
        System.out.println("\nAfter inserting 5555 at tail:");
        printList(head);

        // Step 4: Insert at specific position (0-based indexing)
        head = insertNodeAtPosition(head, 10101, 7); // insert at index 7
        System.out.println("\nAfter inserting 10101 at position 7:");
        printList(head);

        // Step 5: Insert at position beyond current length (auto tail)
        head = insertNodeAtPosition(head, 20202, 20); // index 20, auto inserts at tail
        System.out.println("\nAfter inserting 20202 at position 20 (auto tail):");
        printList(head);

        // Step 6: Delete head node
        ListNode newHead = deleteHead(head);
        System.out.println("\nAfter deleting head node:");
        printList(newHead);

        // Step 7: Delete last node
        deleteEndNode(head);
        System.out.println("\nAfter deleting last node:");
        printList(head);

        // Step 8: Delete node at specific position
        deleteNodePositon(head, 3); // delete node at index 3
        System.out.println("\nAfter deleting node at position 3:");
        printList(head);
    }

    // Delete node at a given position (0-based)
    private static void deleteNodePositon(ListNode head, int position) {
        ListNode temp = head;
        // Traverse to node just before the one to delete
        for (int i = 1; i < position - 1; i++) {
            temp = temp.nextNode;
        }
        // Adjust links to skip the deleted node
        ListNode delelteNode = temp.nextNode;
        temp.nextNode = delelteNode.nextNode;
    }

    // Delete last node of the list
    private static void deleteEndNode(ListNode head) {
        ListNode temp = head;
        // Traverse to the second last node
        while (temp.nextNode.nextNode != null) {
            temp = temp.nextNode;
        }
        // Remove the last node
        temp.nextNode = null;
    }

    // Delete head node and return new head
    private static ListNode deleteHead(ListNode head) {
        ListNode newHead = head.nextNode;
        return newHead;
    }

    // Insert a new node at the beginning (head) and return new head
    public static ListNode insertNodeAtFirst(ListNode head, int value) {
        ListNode newHeadNode = new ListNode(value);
        newHeadNode.nextNode = head; // point new node to old head
        return newHeadNode;          // return new head
    }

    // Insert a new node at the end (tail)
    public static void insertNodeAtLast(ListNode head, int value) {
        if (head == null) {
            System.out.println("List is empty. Cannot insert at last.");
            return;
        }
        ListNode newNode = new ListNode(value);
        ListNode temp = head;
        // Traverse to the last node
        while (temp.nextNode != null) {
            temp = temp.nextNode;
        }
        temp.nextNode = newNode; // attach new node at the end
    }

    // Insert a new node at a given position (0-based)
    public static ListNode insertNodeAtPosition(ListNode head, int value, int position) {
        ListNode newNode = new ListNode(value);

        // Case 1: Insert at head
        if (position == 0) {
            newNode.nextNode = head;
            return newNode; // head updated
        }

        // Case 2: Insert at middle or tail
        ListNode temp = head;
        for (int i = 1; i < position; i++) {
            if (temp.nextNode == null) {
                // Reached end before desired position → insert at tail
                temp.nextNode = newNode;
                return head;
            }
            temp = temp.nextNode;
        }

        // Insert node in between
        newNode.nextNode = temp.nextNode;
        temp.nextNode = newNode;
        return head; // head remains same
    }

    // Print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.nextNode;
        }
        System.out.println("null");
    }
}
