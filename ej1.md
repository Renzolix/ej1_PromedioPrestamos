# Ejercicio 1: PromedioPrestamos

## Explicación Lógica
1. **Lanzamiento Manual:** El método `calcularPromedioDiario` evalúa `if (diasOperativos == 0)` y lanza una instancia de `ArithmeticException` para evitar resultados inconsistentes o divisiones no válidas.
2. **Control de Flujo:** En el `main`, el bloque `try-catch` captura el error aritmético e imprime el mensaje descriptivo por la salida estándar de error (`System.err`), evitando que la aplicación colapse.