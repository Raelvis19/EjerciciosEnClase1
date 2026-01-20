package EjerciciosEnClase1;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        //Ejercicio 1 imprimir nombre, matricula, carrera
        Ejercicio1 ejercicio1 = new Ejercicio1();
        System.out.println("Ejercicio 1 imprimir nombre, matricula, carrera.");
        ejercicio1.imprima();

        System.out.println();

        //El siguiente código tiene errores. Identifícalos y corrígelos:

        Ejercicio13 ejercicio13 = new Ejercicio13();
        System.out.println("El siguiente código tiene errores. Identifícalos y corrígelos:");
        ejercicio13.imprime2();
        
        //Crea un programa que calcule y muestre el área de un rectángulo con base = 5 y altura = 10.
        System.out.println();
        System.out.println("Crea un programa que calcule y muestre el área de un rectángulo con base = 5 y altura = 10.");
        Ejercico14 ejercico14 = new Ejercico14();
        ejercico14.resultado();

        /*Escribe un programa que imprima:
        - Tu universidad
        - Tu semestre actual
        - Tu materia favorita
        - Un mensaje motivacional*/
        System.out.println();
        System.out.println("Trabajar con múltiples líneas de salida:");
        Ejercicio15 ejercicio15 = new Ejercicio15();
        ejercicio15.imp();

        /*Crea un programa que lea dos números desde el teclado y muestre:
        - La suma
        - La resta
        - La multiplicación
        - La división
        - El módulo (residuo)
         */
        System.out.println();
        System.out.println("Calculadora:");
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = sc.nextInt();
        Ejercicio22 calculadora = new Ejercicio22(a, b);
              System.out.println("Suma: " + calculadora.suma());
        System.out.println("Resta: " + calculadora.resta());
        System.out.println("Multiplicacion: " + calculadora.multiplicacion());
        System.out.println("Division: " + calculadora.division());
        System.out.println("Modulo: " + calculadora.modulo());

        System.out.println();

        //Escribe un programa que convierta temperatura de Celsius a Fahrenheit y viceversa.
        System.out.println("Escribe un programa que convierta temperatura de Celsius a Fahrenheit y viceversa.");

                Scanner sc1 = new Scanner(System.in);

        
        Ejercicio23 conversor = new Ejercicio23();

        System.out.println("Seleccione una opcion:");
        System.out.println("1. Convertir de Celsius a Fahrenheit");
        System.out.println("2. Convertir de Fahrenheit a Celsius");
        System.out.print("Opcion: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese la temperatura en Celsius: ");
            double c = sc.nextDouble();
            System.out.println("Temperatura en Fahrenheit: " +
                    conversor.celsiusAFahrenheit(c));
        } else if (opcion == 2) {
            System.out.print("Ingrese la temperatura en Fahrenheit: ");
            double f = sc.nextDouble();
            System.out.println("Temperatura en Celsius: " +
                    conversor.fahrenheitACelsius(f));
        } else {
            System.out.println("Opcion no valida");
        }

            
        System.out.println();
        //Crea un programa que calcule el área y perímetro de un círculo:
        System.out.println("Crea un programa que calcule el área y perímetro de un círculo:");
        Scanner sc3 = new Scanner(System.in);

        System.out.print("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();

        // Instanciar la clase
        Ejercicio24 c = new Ejercicio24(radio);

        // Mostrar resultados
        System.out.println("Area del circulo: " + c.calcularArea());
        System.out.println("Perimetro del circulo: " + c.calcularPerimetro());

        

        //Entender Conversiones de tipo
        System.out.println();
        System.out.println("Entender Conversiones de tipo:");
        Ejercicio25 conversiones = new Ejercicio25();
        conversiones.mostrarConversiones();

        //Sistema de Calificaciones
        System.out.println();
        System.out.println("Sistema de Calificaciones");
        Scanner sc4 = new Scanner(System.in);

        System.out.print("Ingrese la calificacion (0-100): ");
        int nota = sc.nextInt();

        // Instanciar la clase
        Ejercicio3 sistema = new Ejercicio3();

        // Evaluar la calificación
        sistema.evaluarCalificacion(nota);

        

        //Menu de Calculadora
        System.out.println();
        System.out.println("Menu de Calculadora:");
        Ejercicio32 menu = new Ejercicio32();
        menu.mostrarMenu();

        //Tabla de multipicar
        System.out.println();
        System.out.println("Tabla de Multiplicar");
        Scanner sc9 = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();

        // Instanciar la clase
        Ejercicio33 tabla = new Ejercicio33();

        // Mostrar la tabla
        tabla.mostrarTabla(numero);

        //Numero Primo
        System.out.println();
        System.out.println("Detector de numeros primos:");
        Scanner sc0 = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero9 = sc.nextInt();

        
        Ejercicio34 detector = new Ejercicio34();

        // Verificar si es primo
        if (detector.esPrimo(numero9)) {
            System.out.println("El numero " + numero + " ES primo");
        } else {
            System.out.println("El numero " + numero + " NO es primo");
        }

        //Ejercicio 3.5 Bucles anidados
        System.out.println();
        System.out.println("Ejercicio 3.5 Bucles Anidados:");
        Ejercicio35 bucles = new Ejercicio35();
        bucles.imprimirPatron(5);
        bucles.imprimirPatronInvertido(5);


    }
}
