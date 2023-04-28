import java.util.Scanner;
public class Menu {
    public Scanner scanner;
    Resolver resolver = new Resolver();
    public Menu() {
        scanner = new Scanner(System.in);
    }
    public void menuOperacion(){
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("\n - - Resolver trinomios - - ");
            System.out.println("1.- Ingresar datos ");
            System.out.println("2.- Salir:");
            System.out.println("Ingrese un opcion :");
            opcion = scanner.nextInt();
            System.out.println(" ");
            switch (opcion) {
                case 1:
                    resolver.Operacion();
                    break;
                case 2:
                    System.out.println("Usted a salido de la operacion.");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}