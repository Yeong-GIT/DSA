package SinglyLinkedList;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront (Employee employee){
        EmployeeNode node = new EmployeeNode(employee); // Creating new instance
        node.setNext (head); // link new node to the previous head instance
        head = node; // declare new node as head
        size++;
    }

    public EmployeeNode removeFromFront() {
        if( isEmpty()){
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext(); // point to the next node
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
