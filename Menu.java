package semana07_practica;
import java.util.Scanner;
public class Menu 
{
    private Scanner sc;
    private ListaEnlazada lista;

    public Menu() {
        sc = new Scanner(System.in);
        lista = new ListaEnlazada();
    }

    public void iniciar() {

        int opcion;

        do {

            mostrarOpciones();

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    insertarNodo();
                    break;

                case 2:
                    eliminarNodo();
                    break;

                case 3:
                    lista.mostrar();
                    break;

                case 4:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        sc.close();
    }

    private void mostrarOpciones() {

        System.out.println("\n===== MENÚ =====");
        System.out.println("1. Insertar nodo");
        System.out.println("2. Eliminar nodo");
        System.out.println("3. Mostrar lista");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void insertarNodo() {

        System.out.print("Ingrese dato: ");
        int dato = sc.nextInt();

        lista.insertar(dato);

        System.out.println("Nodo insertado correctamente");
    }

    private void eliminarNodo() {

        System.out.print("Ingrese dato a eliminar: ");
        int dato = sc.nextInt();

        boolean eliminado = lista.eliminar(dato);

        if (eliminado) {
            System.out.println("Nodo eliminado correctamente");
        } else {
            System.out.println("Nodo no encontrado");
        }
    }
}

