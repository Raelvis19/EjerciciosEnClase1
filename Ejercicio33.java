package EjerciciosEnClase1;

class Ejercicio33 {
    
    public void mostrarTabla(int numero) {

        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
    
}