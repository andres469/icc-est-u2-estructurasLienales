package controllers;

import models.Node;

public class Stack <T> {
    private Node<T> top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(T data){
        Node<T> newNode=new Node<T>(data);
        newNode.setNext(top);
        top=newNode;
        size++;
        

    }
    public T pop(){

        if (top==null) {
            return null; // o lanzar una excepción
        }
        T data = top.getValue();
        top = top.getNext();
        size--;
        return data;

    }
    public T peek(){
        if (top==null) {
            return null; // o lanzar una excepción
        }
        return top.getValue();
    }

    public boolean isEmpty(){
        return top==null;
    }

    public int size(){
        // if (isEmpty()) {
        //     return 0;
        // }
        // int count=0;
        // Node<T> aux=top;
        // while (aux.getNext()!=null) {
        //     count++;
        //     aux=aux.getNext();
        // }
        // return count;
        return size;
    }

    public void printAllNodes(){
        Node<T> current=top;
        System.out.println("--- Cima Nodes ---");
        while (current!=null) {
            System.out.println(current.getValue()+"->");
            current=current.getNext();
        }
        System.out.println("Fin Stack");

    }

}
