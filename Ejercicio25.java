package EjerciciosEnClase1;

public class Ejercicio25 {

        public void mostrarConversiones() {

        // Conversión implícita (int -> double)
        int entero = 10;
        double decimal = entero;

        System.out.println("Conversion implicita:");
        System.out.println("Entero: " + entero + ", Decimal: " + decimal);

        System.out.println();

        // Conversión explícita (double -> int)
        double d = 9.7;
        int i = (int) d;

        System.out.println("Conversion explicita (casting):");
        System.out.println("Double: " + d + ", Int: " + i);
    }
    
}
