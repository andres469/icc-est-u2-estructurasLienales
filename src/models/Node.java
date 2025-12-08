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
        StringBuilder sb = new StringBuilder();
        sb.append("Node{");
        sb.append("value=").append(value);
        
        // **CORRECCIÓN:** Se imprime el código hash o "null" para romper el ciclo de recursión.
        sb.append(", next=").append(next != null ? "Node@" + Integer.toHexString(next.hashCode()) : "null");
        sb.append(", prev=").append(prev != null ? "Node@" + Integer.toHexString(prev.hashCode()) : "null");
        
        sb.append('}');
        return sb.toString();
    }
    
    

    

    
    
}
