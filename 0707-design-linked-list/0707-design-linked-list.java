class MyLinkedList {
    class Node {
        // Your node fields and constructor
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

    }

    Node head;
    Node tail;
    int size = 0;

    public MyLinkedList() {

    }

    public int get(int index) {
        int i = 0;
        Node curr = head;
        while (curr != null) {
            if (i == index) {
                return curr.val;
            }
            curr = curr.next;
            i++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node newHead = new Node(val);
        size++;
        if (head == null) {
            head = tail = newHead;
            return;
        }

        newHead.next = head;
        head = newHead;
    }

    public void addAtTail(int val) {
        Node newHead = new Node(val);
        size++;
        if (head == null) {
            head = tail = newHead;
            return;
        }

        tail.next = newHead;
        tail = newHead;
    }

    public void addAtIndex(int index, int val) {
        int i = 0;
        if (index < 0 || index > size) {
            return;
        }
        Node curr = head;
        Node dummy = new Node(-1001);
        Node newNode = new Node(val);
        dummy.next = head;

        Node prev = dummy;
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        while (i != index) {
            curr = curr.next;
            prev = prev.next;
            i++;
        }

        newNode.next = prev.next;
        prev.next = newNode;
        if (index == size) {
            tail = newNode;
        }
        if(index==0){
            head=newNode;
        }
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        Node curr = head;
        Node dummy = new Node(-10012);
        dummy.next = head;
        Node prev = dummy;
        int i = 0;
        while (i != index) {
            i++;
            curr = curr.next;
            prev = prev.next;
        }
        
        if (head == null || head.next == null) {
            head = tail = null;
            size--;
            return;
        }
       prev.next = curr.next;
            if (index == 0) {
                head = curr.next;
            }
            if (index == size - 1) {
                tail = prev;
            }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */