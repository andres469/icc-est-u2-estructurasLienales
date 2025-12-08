import models.Node;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // 1. Creación de Nodos
        Node<Person> node1 = new Node<Person>(new Person("Juan", 30));
        Node<Person> node2 = new Node<Person>(new Person("Maria", 35));
        Node<Person> node3 = new Node<Person>(new Person("pepito", 33));
        Node<Person> node4 = new Node<Person>(new Person("diego", 39));

        // 2. Enlace hacia adelante (next)
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        // 3. Enlace hacia atrás (prev)
        node4.setPrev(node3);
        node3.setPrev(node2);
        node2.setPrev(node1);
        
        // 4. Recorrido de la lista completa (Método recomendado)
        printList(node1);

        // 5. Impresión de un solo nodo (usa el toString() corregido)
        System.out.println("\nImprimiendo node1 con toString():");
        System.out.println(node1);
        
        System.out.println("\nNode 1 (Directo): " + node1.getValue().getName() + ", Age: " + node1.getValue().getAge() );
    }
    
    /**
     * Recorre la lista doblemente enlazada desde el nodo 'head' (cabeza)
     * e imprime los valores de cada persona.
     */
    public static void printList(Node<Person> head) {
        System.out.println("\n--- Recorrido de la Lista ---");
        Node<Person> current = head;
        while (current != null) {
            Person p = current.getValue();
            System.out.println("-> Nombre: " + p.getName() + ", Edad: " + p.getAge());
            current = current.getNext(); // Avanza al siguiente nodo
        }
        System.out.println("------------------------------");
    }
}