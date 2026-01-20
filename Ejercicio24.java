package EjerciciosEnClase1;

public class Ejercicio24 {

    

    // Constante
    public static final double PI = 3.14159;

    // Atributo
    private double radio;

    // Constructor
    public Ejercicio24(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double calcularArea() {
        return PI * radio * radio;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }


    
}
