package EjerciciosEnClase1;

public class Ejercicio3 {

        public void evaluarCalificacion(int nota) {

        char letra;

        if (nota >= 90 && nota <= 100) {
            letra = 'A';
        } else if (nota >= 80) {
            letra = 'B';
        } else if (nota >= 70) {
            letra = 'C';
        } else if (nota >= 60) {
            letra = 'D';
        } else if (nota >= 0) {
            letra = 'F';
        } else {
            System.out.println("Calificacion no valida");
            return;
        }

        System.out.println("Calificacion numerica: " + nota);
        System.out.println("Calificacion en letra: " + letra);

        // Indicar si aprobó o reprobó
        if (nota >= 70) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
    
}
