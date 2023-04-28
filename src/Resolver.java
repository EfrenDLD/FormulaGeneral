import java.util.Scanner;
public class Resolver {
    public Scanner scanner;
    public Resolver() {
        scanner = new Scanner(System.in);
    }
    public void Operacion(){
        double valorA = 0;
        double valorB = 0;
        double valorC = 0;
        System.out.println("1.-Ingrese el valor de a :");
        valorA = scanner.nextDouble();
        System.out.println("2.-Ingrese el valor de b :");
        valorB = scanner.nextDouble();
        System.out.println("3.-Ingrese el valor de c :");
        valorC = scanner.nextDouble();

        //Calcular la discriminante b^2 - 4ac
        double discriminante = Math.pow(valorB,2) - 4 * valorA * valorC;
        System.out.println("La discriminate es = "+discriminante);

        if (discriminante > 0) {//Si la ecuacion es positivo la escuacion tiene dos soluciones
            System.out.println("La ecuación tiene dos soluciones reales.");
        } else if (discriminante == 0) {
            System.out.println("La ecuación tiene una solución real doble.");
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }

        if (discriminante>0) {//Usando la formula general x = -b +- ((raiz)b^2 -4bc) / 2a
            double solucion1 = (-valorB + Math.sqrt(discriminante)) / (2 * valorA);//Math.sqrt para sacar la raiz
            double solucion2 = (-valorB - Math.sqrt(discriminante)) / (2 * valorA);
            System.out.println("Solucion x1 : " + solucion1);
            System.out.println("Solucion x2 : " + solucion2);
        } else if (discriminante == 0) {
            double x = -valorB / (2 * valorA);
            System.out.println("Unica solucion x = " + x);
        }

    }

}
