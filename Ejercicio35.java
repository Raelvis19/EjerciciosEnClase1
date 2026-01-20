package EjerciciosEnClase1;

public class Ejercicio35 {

    int lineas = 5;

    public Ejercicio35(){

    }

    public Ejercicio35(int lins){
        this.lineas = lins;
    }

      // Patrón normal
    public void imprimirPatron(int lineas) {

        for (int i = 1; i <= lineas; i++) {          // controla las filas
            for (int j = 1; j <= i; j++) {           // imprime asteriscos
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Patrón invertido (BONUS)
    public void imprimirPatronInvertido(int lineas) {

        for (int i = lineas; i >= 1; i--) {          // filas de mayor a menor
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
