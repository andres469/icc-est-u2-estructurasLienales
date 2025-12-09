package models;

public class Node <T>{
    private T value;
    private Node<T> next;
    private Node<T> prev;

    public Node(T value) {
        this.value = value;
        this.next = null;
        this.prev = null;   
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }
@Override
    public String toString() {
        // Esta línea es la clave para evitar el StackOverflowError
        return "Node{" +
               "value=" + value +
               ", next=" + (next != null ? "Node@" + Integer.toHexString(next.hashCode()) : "null") +
               ", prev=" + (prev != null ? "Node@" + Integer.toHexString(prev.hashCode()) : "null") +
               '}';
    }
    
    

    

    
    
}
