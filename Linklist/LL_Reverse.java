package Linklist;

class MyNode {
    int data;
    MyNode next;

    MyNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LL_Reverse {
    public static void main(String[] args) {

        MyNode n1 = new MyNode(10);
        MyNode n2 = new MyNode(108);
        MyNode n3 = new MyNode(150);
        MyNode n4 = new MyNode(180);
        MyNode n5 = new MyNode(100);

        MyNode head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.print("LL before reverse : ");
        traverse(head);

        System.out.print("LL before reverse : ");
        traverse(reverse(head));

    }

    public static void traverse(MyNode headNode) {
        MyNode temp = headNode;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static MyNode reverse(MyNode hNode) {
        MyNode pre = null;
        MyNode curr = hNode;

        while (curr != null) {
            MyNode nextNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextNode;
        }
        return pre;
    }

}
