package LinkedList;

public class LinkedList {
    Node headNode;
    int count = 0;

    // Add element at end
    public void add(Object eleObject) {
        if (headNode == null) {
            headNode = new Node(eleObject);
            count++;
            return;
        }
        Node currNode = headNode;
        while (currNode.nextNode != null) {
            currNode = currNode.nextNode;
        }
        currNode.nextNode = new Node(eleObject);
        count++;
    }

    // Display all elements
    public void display() {
        Node currNode = headNode;
        while (currNode != null) {
            System.out.println(currNode.eleObject);
            currNode = currNode.nextNode;
        }
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public Object get(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();

        Node currNode = headNode;
        for (int i = 0; i < index; i++) {
            currNode = currNode.nextNode;
        }
        return currNode.eleObject;
    }

    // ✅ Fix: Add at beginning
    public void addFirst(Object eleObject) {
        Node n = new Node(eleObject);
        n.nextNode = headNode;
        headNode = n;
        count++;
    }

    // ✅ Fix: Add at given index
    public void add(Object eleObject, int index) {
        if (index < 0 || index > size()) throw new IndexOutOfBoundsException();

        if (index == 0) {
            addFirst(eleObject);
            return;
        }

        Node currNode = headNode;
        for (int i = 0; i < index - 1; i++) {
            currNode = currNode.nextNode;
        }

        Node n = new Node(eleObject);
        n.nextNode = currNode.nextNode;
        currNode.nextNode = n;
        count++;
    }

    // ✅ Fix: Remove first (no parameter needed)
    public void removeFirst() {
        if (headNode == null) throw new RuntimeException("List is empty");
        headNode = headNode.nextNode;
        count--;
    }

    // ✅ Fix: Remove by index
    public void remove(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();

        if (index == 0) {
            removeFirst();
            return;
        }

        Node currNode = headNode;
        for (int i = 0; i < index - 1; i++) {
            currNode = currNode.nextNode;
        }

        currNode.nextNode = currNode.nextNode.nextNode;
        count--;
    }
}
