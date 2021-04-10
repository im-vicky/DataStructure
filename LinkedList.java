class LinkedList {
    Node head;

    static class  Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static LinkedList insert (LinkedList linkedList, int data) {
        Node node = new Node(data);
        node.next = null;

        if(linkedList.head == null ) {
            linkedList.head = node; 
        } else {
            Node temp = linkedList.head;

            while(temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
        }
        return linkedList;
    }

    public static void printLinkedList (LinkedList linkedList) {
        Node temp = linkedList.head;

        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(linkedList,5);
        linkedList.insert(linkedList,4);
        linkedList.insert(linkedList,3);
        linkedList.insert(linkedList,2);
        linkedList.insert(linkedList,1);
        linkedList.insert(linkedList,6);
        linkedList.insert(linkedList,7);
        linkedList.insert(linkedList,8);

       printLinkedList(linkedList); 
    }
}