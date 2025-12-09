import controllers.Stack;
import models.Node;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Node<Person> node1 = new Node<Person>(new Person("Juan", 30));
        Node<Person> node2 = new Node<Person>(new Person("Maria", 35));
        Node<Person> node3 = new Node<Person>(new Person("pepito", 33));
        Node<Person> node4 = new Node<Person>(new Person("diego", 39));

        Stack<Person> persons=new Stack<Person>();
        persons.push(new Person("Juan", 30));
        persons.push(new Person("Maria", 35));
        persons.push(new Person("Pepito", 32));
        persons.push(new Person("Diego", 31));
        System.out.println("Tamaño del stack: " + persons.size());
        persons.printAllNodes();
        System.out.println(persons.pop());
        System.out.println("Sise= "+ persons.size());
        persons.printAllNodes();

        // node1.setNext(node2);
        // node2.setNext(node3);
        // node3.setNext(node4);


        // node4.setPrev(node3);
        // node3.setPrev(node2);
        // node2.setPrev(node1);
        
        // printList(node1);

        // System.out.println("\nImprimiendo node1 con toString():");
        // System.out.println(node1);
        
        // System.out.println("\nNode 1 (Directo): " + node1.getValue().getName() + ", Age: " + node1.getValue().getAge() );




    }
    

    public static void printList(Node<Person> head) {
        System.out.println("\n--- Recorrido de la Lista ---");
        Node<Person> current = head;
        

        while (current != null) {
            // Obtenemos e imprimimos el valor de la persona
            Person p = current.getValue();
            System.out.println("-> Nombre: " + p.getName() + ", Edad: " + p.getAge());
            
            // Avanzamos al siguiente nodo de forma segura
            current = current.getNext(); 
        }
        System.out.println("------------------------------");
    }
}