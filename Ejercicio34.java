package EjerciciosEnClase1;

public class Ejercicio34 {

        public boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= numero - 1; i++) {
            if (numero % i == 0) {
                return false; // tiene divisor, no es primo
            }
        }

        return true; // no se encontraron divisores
    }
    
}
