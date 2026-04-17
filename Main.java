import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDobleCircular lista = new ListaDobleCircular();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n========================================");
            System.out.println("   LISTA DOBLEMENTE ENLAZADA CIRCULAR");
            System.out.println("========================================");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar al inicio");
            System.out.println("4. Eliminar al final");
            System.out.println("5. Buscar elemento");
            System.out.println("6. Imprimir lista");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                String entrada = sc.nextLine();
                opcion = Integer.parseInt(entrada);
                int dato;

                switch (opcion) {
                    case 1:
                        System.out.print("Dato inicio: ");
                        dato = Integer.parseInt(sc.nextLine());
                        lista.insertarInicio(dato);
                        lista.imprimir();
                        break;
                    case 2:
                        System.out.print("Dato final: ");
                        dato = Integer.parseInt(sc.nextLine());
                        lista.insertarFinal(dato);
                        lista.imprimir();
                        break;
                    case 3:
                        lista.eliminarInicio();
                        lista.imprimir();
                        break;
                    case 4:
                        lista.eliminarFinal();
                        lista.imprimir();
                        break;
                    case 5:
                        System.out.print("Dato a buscar: ");
                        dato = Integer.parseInt(sc.nextLine());
                        System.out.println(lista.buscar(dato) ? "¡Encontrado!" : "No encontrado");
                        break;
                    case 6:
                        lista.imprimir();
                        break;
                    case 7:
                        System.out.println("Saliendo...");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese un número válido.");
            }
        } while (opcion != 7);
        sc.close();
    }
}