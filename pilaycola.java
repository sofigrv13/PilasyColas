import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        Queue<Integer> cola = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion, elemento;

        do {
            System.out.println("Menu:");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Borrar elemento");
            System.out.println("3. Mostrar Pila");
            System.out.println("4. Mostrar Cola");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    elemento = scanner.nextInt();
                    pila.push(elemento);
                    cola.add(elemento);
                    break;

                case 2:
                    if (!pila.isEmpty() && !cola.isEmpty()) {
                        System.out.println("Elemento eliminado de la Pila: " + pila.pop());
                        System.out.println("Elemento eliminado de la Cola: " + cola.poll());
                    } else {
                        System.out.println("La Pila y la Cola están vacías.");
                    }
                    break;

                case 3:
                    mostrarPila(pila);
                    break;

                case 4:
                    mostrarCola(cola);
                    break;

                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);
        
        scanner.close();
    }

    private static void mostrarPila(Stack<Integer> pila) {
        System.out.print("Elementos de la Pila: ");
        for (Integer elemento : pila) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    private static void mostrarCola(Queue<Integer> cola) {
        System.out.print("Elementos de la Cola: ");
        for (Integer elemento : cola) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
