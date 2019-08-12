package 链表;

public class Demo1 {
    public static class Node{
        Node next;
        Object data;
        public Node(Object data){
            this.data = data;
        }
        public  Node(Node next,Object data){
            this.data = data;
            this.next = next;
        }
    }
    private static int size;
    private static Node dummyNode;
    private Demo1(Node dummyNode){
        this.dummyNode = new Node(null,null);
    }
    //添加元素
    public static void add(int index,Object data){
        Node per = dummyNode;
        Node newNode = new Node(data);
        for(int i=0; i<index; i++){
            per = per.next;
        }
        newNode.next = per.next;
        per.next = newNode;
        size++;
    }
    //头插
    public static void HeadAdd(Object data){
        add(0,data);
    }
    //尾插
    public static void TailAdd(Object data){
        add(size,data);
    }
    //是否包含某个值
    public static boolean isContain(Object data){
        for(Node temp = dummyNode.next; temp!=null; temp=temp.next){
            if(data==temp.data){
                return true;
            }
        }
        return false;
    }
    //链表的反转
    public static void reversal(Node dummyNode){
        Node f = dummyNode.next;
        Node s = f.next;
        while(f.next!=null){
            f.next = s.next;
            s.next = dummyNode.next;
            dummyNode.next = s;
            s = f.next;
        }
    }
    //将前k个结点反转
    public static void Kreversal(int index,Node dummyNode){
        Node per = dummyNode.next;
        for(int i=0; i<index; i++){
            per = per.next;
        }
        Node f = dummyNode.next;
        Node s = f.next;
        while (f.next!=per){
            f.next = s.next;
            s.next = dummyNode.next;
            dummyNode.next = s;
            s = f.next;
        }
    }
    //链表排序
    public static void Sort(Node dummyNode){
        Node node = dummyNode.next;
        Node per = null;
        while (node!=null){
            per = node.next;
            while(per!=null){
                if((int)node.data>(int)per.data){
                    int temp = (int)node.data;
                    node.data = per.data;
                    per.data = temp;
                }
                per = per.next;
            }
            node = node.next;
        }
    }
    //清空链表
    public static void clear(){
        for(Node temp=dummyNode.next; temp.next!=null; temp=temp.next){
            temp.data= null;
            Node per = temp.next;
            temp.next=null;
            temp = per;
            size--;
        }
    }

    public static void print(){
        for(Node temp=dummyNode.next; temp!=null; temp=temp.next) {
            System.out.print(temp.data + " ");

        }
    }

    //链表大小
    public static int size(int size) {
        return size;
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1(dummyNode);
        TailAdd(3);
        TailAdd(2);
        TailAdd(5);
        TailAdd(4);
        TailAdd(7);
        TailAdd(6);
        TailAdd(1);
        print();
        System.out.println();
        //clear();
        //Kreversal(3,dummyNode);
        Sort(dummyNode);
        print();
    }
}
