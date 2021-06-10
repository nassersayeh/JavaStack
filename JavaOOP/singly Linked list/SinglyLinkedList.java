public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
        head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public Node remove(){
        if (head == null){
            System.out.println("List is empty");
        }
        Node temp = head ;
        temp = temp.next;
        head = temp;
        return head;
    }
    public Node find(int x){
        if (head.value == x)
        return head;
        return null;
    }
    public void printValues(){
        while(head != null){
            System.out.println(head.value);
            head = head.next;
        }
    }
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
}