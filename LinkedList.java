import java.util.InputMismatchException;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    String dni; // Atributo para almacenar el DNI

    public LinkedList() {
        this.head = null;
        this.dni = "";
    }

    public void setDni(String dni) {
        this.dni = dni;
        System.out.println("DNI registrado: " + this.dni);
        // Los dígitos se agregarán directamente en el main al registrar el DNI ahora
    }

    public void addDniDigitsToList() {
        for (int i = 0; i < this.dni.length(); i++) {
            if (Character.isDigit(this.dni.charAt(i))) {
                this.add(Character.getNumericValue(this.dni.charAt(i)));
            }
        }
        System.out.println("Dígitos del DNI agregados a la lista.");
    }

    // i. Método add(int data): Agrega un nuevo nodo al final de la lista.
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // ii. Método addFirst(int data): Agrega un nuevo nodo al inicio de la lista.
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // iii. Método addMiddle(int data, int position): Agrega un nuevo nodo en una posición específica de la lista.
    public void addMiddle(int data, int position) {
        if (position <= 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        int count = 0;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("La posición es inválida.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // iv. Método removeLast(): Remueve el último nodo de la lista.
    public void removeLast() {
        if (head == null) {
            System.out.println("La lista está vacía, no se puede remover.");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Último elemento removido.");
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        System.out.println("Último elemento removido.");
    }

    // vi. Método contains(int value): Verifica si un valor existe en la lista (renombrado a contamos).
    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // vii. Método reverse(): Revierte el orden de la lista enlazada.
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        System.out.println("Lista revertida.");
    }

    // viii. Método printList(): Imprime los valores de los nodos en la lista.
    public void printList() {
        System.out.print("Lista actual: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList(); // Crear la instancia de LinkedList

        System.out.println("Ingrese su número de DNI:");
        String dni = scanner.nextLine();
        list.setDni(dni); // Registrar el DNI en la instancia de la lista
        list.addDniDigitsToList(); // Agregar los dígitos a la lista

        System.out.println();

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar un número al inicio de la lista");
            System.out.println("2. Agregar un número al final de la lista");
            System.out.println("3. Agregar un número al medio de la lista (posición 1)");
            System.out.println("4. Remover el último número");
            System.out.println("6. Verificar un número en la lista");
            System.out.println("7. Revertir la lista");
            System.out.println("8. Mostrar la lista actual");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                System.out.println();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el número a agregar al inicio: ");
                        int numInicio = scanner.nextInt();
                        list.addFirst(numInicio);
                        break;
                    case 2:
                        System.out.print("Ingrese el número a agregar al final: ");
                        int numFinal = scanner.nextInt();
                        list.add(numFinal);
                        break;
                    case 3:
                        System.out.print("Ingrese el número a agregar en la posición 1: ");
                        int numMedio = scanner.nextInt();
                        list.addMiddle(numMedio, 1);
                        break;
                    case 4:
                        list.removeLast();
                        break;
                    case 6:
                        System.out.print("Ingrese el número a verificar: ");
                        int numVerificar = scanner.nextInt();
                        if (list.contains(numVerificar)) {
                            System.out.println(numVerificar + " se encuentra en la lista.");
                        } else {
                            System.out.println(numVerificar + " no se encuentra en la lista.");
                        }
                        break;
                    case 7:
                        list.reverse();
                        break;
                    case 8:
                        list.printList();
                        break;
                    case 0:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número entero.");
                scanner.nextLine(); // Limpiar el buffer del scanner
                opcion = -1; // Para que el menú se vuelva a mostrar
            }
        } while (opcion != 0);

        scanner.close();
    }
}