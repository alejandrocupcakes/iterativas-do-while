int factorial = 1;
int numero = 10;
do {
    factorial *= numero--;
} while (numero > 1);
System.out.println("El factorial de " + numero + " es: " + factorial);
