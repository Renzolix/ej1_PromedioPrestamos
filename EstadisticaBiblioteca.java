public class EstadisticaBiblioteca {

    public static double calcularPromedioDiario(int totalPrestamos, int diasOperativos) {
        if (diasOperativos == 0) {
            throw new ArithmeticException("Los días operativos deben ser mayores a cero");
        }
        return (double) totalPrestamos / diasOperativos;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Calculando promedio con 0 días operativos...");
            double promedio = calcularPromedioDiario(150, 0);
            System.out.println("Promedio diario: " + promedio);
        } catch (ArithmeticException e) {
            System.err.println("Error capturado: " + e.getMessage());
        }
    }
}