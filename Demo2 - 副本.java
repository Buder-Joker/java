package 链表;
/*
删除链表中倒数第k个元素
 */
public class Demo2 {
    public class Node {
        int val;
        Node next;
        Node(int x) { val = x; }
    }
    public Node removeNthFromEnd(Node head, int n) {
        Node fast = head;
        Node frist = head;
        for(int i=0; i<n; i++){
            fast = fast.next;
        }
        //[1] n=1时，必须要head.next
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            frist = frist.next;
            fast = fast.next;
        }
        frist.next = frist.next.next;
        return head;
    }
}
