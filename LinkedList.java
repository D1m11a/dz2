package LinkedList;

public class LinkedList<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;

    private int size;

    public LinkedList() {
        size = 0;
    }

    public void add(T value) {
        if (firstNode == null) {
            firstNode = new Node<T>(null, null, value);
        } else if (lastNode == null) {
            lastNode = new Node<T>(firstNode, null, value);
            firstNode.setNextNode(lastNode);
        } else {
            Node<T> node = new Node<T>(lastNode, null, value);
            lastNode.setNextNode(node);
            lastNode = node;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index" + index);
        }
        if (index == 0) {
            firstNode = firstNode.getNextNode();
        }
        if (firstNode == null) {
            lastNode = null;
        } else {
            Node<T> previousNode = get(index - 1);
            Node<T> nodeToRemove = previousNode.getNextNode();
            Node<T> nextNode = nodeToRemove.getNextNode();
            previousNode.setNextNode(nextNode);

            if (nodeToRemove == lastNode) {
                lastNode = previousNode;
            }
        }
        size--;
    }

    public Node<T> get(int index) {
        Node<T> currentNode = firstNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();

        }
        return currentNode;
    }

    public void clear(){
        firstNode = null;
        lastNode = null;
         size = 0;
    }
    public int size(){
        return size;
    }
}
