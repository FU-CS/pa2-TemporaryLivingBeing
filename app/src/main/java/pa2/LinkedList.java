package pa2;

/**
 * A sorted singly linked list of integers
 */
public class LinkedList {

    /**
     * A node in the linked list
     */
    public Node head;

    /**
     * Constructor
     * Initialize the linked list with a null head
     */
    public LinkedList() {
        this.head = null;
    }

    /** 
     * Add a new node to the linked list 
     * so that the list remains sorted
     * @param value The value to add
     * @return void
     */
    public void add(int value) {
        Node node = new Node(value);
        if (head == null || value < head.value) {
            node.next = head;
            head = node;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.value <= value) {
            current = current.next;
        }

        node.next = current.next;
        current.next = node;
    }

    /**
     * Remove the first node with the given value
     * If the value is not found, do nothing
     * @param value The value to remove
     * @return void
     */
    public void remove(int value) {
        if (head == null) return;

        if (head.value == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.value != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }
    /**
     * Traverse the linked list RECURSIVELY and returns a string representation of the list
     * @param current
     * @return String
     */
    private String traverse(Node current){
        if (current == null) {
            return "";
        }
        if (current.next == null) {
            return Integer.toString(current.value);
        }
        return Integer.toString(current.value) + " " + traverse(current.next);
    }

    /**
     * Traverse the linked list and returns a string representation of the list
     * @return String
     */
    public String traverse(){
        return traverse(this.head);
    }
    public String reverse(){
        return reverse(this.head);
    }

    /**
     * Traverse the linked list RECURSIVELY and 
     * returns a string representation of the list
     * @return String
     */
    private String reverse(Node current){
        if (current == null) {
            return "";
        }
        if (current.next == null) {
            return Integer.toString(current.value);
        }
        return(this.reverse(current.next) + " " + Integer.toString(current.value));
    }
    /**
     * Merges two sorted linked list and returns the 
     * merged linked list that is also sorted
     * @param list1 The first sorted linked list
     * @param list2 The second sorted linked list 
     * @return LinkedLists
     */

    // use two pointers to determine what you are going to add. curr1, curr2.

    public static LinkedList merge(LinkedList list1, LinkedList list2){
        LinkedList result = new LinkedList();
        Node curr1 = list1.head;
        Node curr2 = list2.head;

        while (curr1 != null && curr2 != null) {
            if (curr1.value <= curr2.value) {
                result.add(curr1.value);
                curr1 = curr1.next;
            } else {
                result.add(curr2.value);
                curr2 = curr2.next;
            }
        }

        while (curr1 != null) {
            result.add(curr1.value);
            curr1 = curr1.next;
        }

        while (curr2 != null) {
            result.add(curr2.value);
            curr2 = curr2.next;
        }

        return result;
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // System.out.println(list.reverse());
        list.remove(3);
        // System.out.println(list.traverse());

        LinkedList list2 = new LinkedList();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println("List1 reverse is " + list.reverse());
        System.out.println("List1 is " + list.traverse());

        LinkedList list3 = LinkedList.merge(list, list2);
        System.out.println(list3.traverse(list3.head));
    }
}