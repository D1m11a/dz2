package LinkedList;

public class Node <T>{

    private Node <T> previousNode;
    private Node <T> nextNode;
 private T value;

 public Node(Node <T> previusNode,  Node <T> nextNode, T value){
this.previousNode = previousNode;
this.nextNode = nextNode;
this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node<T> previousNode) {
        this.previousNode = previousNode;
    }
}
