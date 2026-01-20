package EjerciciosEnClase1;


public class Ejercicio22 {

    /*Crea un programa que lea dos números desde el teclado y muestre:
    - La suma
    - La resta
    - La multiplicación
    - La división
    - El módulo (residuo)
     */
        // Atributos
    private int num1;
    private int num2;

    // Constructor
    public Ejercicio22(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Métodos
    public int suma() {
        return num1 + num2;
    }

    public int resta() {
        return num1 - num2;
    }

    public int multiplicacion() {
        return num1 * num2;
    }

    public int division() {
        if (num2 == 0) {
            System.out.println("No se puede dividir entre cero");
            return 0;
        }
        return num1 / num2;
    }

    public int modulo() {
        if (num2 == 0) {
            System.out.println("No se puede calcular el modulo entre cero");
            return 0;
        }
        return num1 % num2;
    }

    
}
