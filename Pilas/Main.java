import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        operacionesDePila();
    }

    public static void operacionesDePila() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("No. de alumnos que va a agregar: ");
        int capacidad = scanner.nextInt();
        PilaCadenas pila = new PilaCadenas(capacidad);

        int opcion;
        do {
            System.out.println("\nOperaciones:");
            System.out.println("1. Agregar (push)");
            System.out.println("2. Eliminar ultimo agregado (pop)");
            System.out.println("3. Mostrar el ultimo agregado (peek)");
            System.out.println("4. Mostrar Todos los agregados");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del Alumno: ");
                    String elemento = scanner.next();
                    pila.push(elemento);
                    break;
                case 2:
                    String cadenaDesapilada = pila.pop();
                    if (cadenaDesapilada != null) {
                        System.out.println("Eliminar ultimo alumno agregado: " + cadenaDesapilada);
                    }
                    break;
                case 3:
                    String cima = pila.peek();
                    if (cima != null) {
                        System.out.println("Ultimo agregado: " + cima);
                    }
                    break;
                case 4:
                    pila.mostrarPila();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}