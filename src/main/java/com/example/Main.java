package com.example;

public class Main {
    public static void main(String[] args) {

        // Ciclo while
        int number = 0;
        while (number <= 10) {
            System.out.println("While De numeros: " + number);
            number++;
        }
        // Ciclo While 2
        int n = 5;
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Suma de 1 a " + n + ": " + sum);

        // 3. Buscar en arreglo si un número ingresado está presente
        int[] arreglo = {3, 4, 6, 8};
        int buscar = 8; 
        boolean encontrado = false;
        for (int numArreglo : arreglo) {
            if (numArreglo == buscar) {
                System.out.println("Número " + buscar + " encontrado en el arreglo.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Número " + buscar + " no encontrado en el arreglo.");
        }

        // Ciclo Do While
        int opcion;
        do {
            System.out.println("Menú:\n1. Opción 1\n2. Opción 2\n3. Salir");
            opcion = 3; 
        } while (opcion != 3);

        // 5. Leer números hasta ingresar 0, mostrar suma
        int numInput = 1; 
        int sumaAcumulada = 0;
        while (numInput != 0) {
            numInput = 0; 
            sumaAcumulada += numInput;
        }
        System.out.println("Suma acumulada: " + sumaAcumulada);

        // 6. Validación de contraseña con mínimo una ejecución
        String contraseñaCorrecta = "abc123";
        String ingreso;
        do {
            ingreso = "abc123"; 
        } while (!ingreso.equals(contraseñaCorrecta));
        System.out.println("Contraseña correcta.");

        //For
        for (int j = 2; j <= 20; j += 2) {
            System.out.println("Par: " + j);
        }

        // 8. Calcular factorial
        int numFact = 5; 
        long factorial = 1;
        for (int f = 1; f <= numFact; f++) {
            factorial *= f;
        }
        System.out.println("Factorial de " + numFact + ": " + factorial);

        // 9. Sumar elementos de un arreglo
        int[] nums = {1, 2, 3, 4, 5};
        int contador = 0;
        for (int valor : nums) {
            contador += valor;
        }
        System.out.println("Suma del arreglo: " + contador);

        //for - each 
        int[] calificaciones = {4, 5, 3, 4};
        double suma = 0;
        for (int calif : calificaciones) {
            suma += calif;
        }
        System.out.printf("Promedio: %.2f%n", suma / calificaciones.length);

        // 11. Lista palabras en colección
        String[] palabras = {"hola", "mundo", "Java"};
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        // 12. Uso de break y continue
        for (int k = 1; k <= 10; k++) {
            if (k == 5) {
                System.out.println("Break en k=5");
                break; 
            }
            if (k % 2 == 0) {
                continue; 
            }
            System.out.println("k: " + k);
        }

        // Ejemplo combinado break y continue
        for (int k = 1; k <= 10; k++) {
            if (k == 8) break; 
            if (k % 3 == 0) continue;       
            System.out.println("k: " + k);
        }
    }
}