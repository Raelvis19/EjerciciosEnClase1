package EjerciciosEnClase1;

import java.util.Scanner;

public class Ejercicio32 {

     public void mostrarMenu() {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU CALCULADORA ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer numero: ");
                double a = sc.nextDouble();

                System.out.print("Ingrese el segundo numero: ");
                double b = sc.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (a * b));
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Resultado: " + (a / b));
                        } else {
                            System.out.println("No se puede dividir entre cero");
                        }
                        break;
                }

            } else if (opcion == 5) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opcion no valida");
            }

        } while (opcion != 5);
        
    }
    
}
