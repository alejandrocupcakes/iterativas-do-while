public static void main(String[] args){
String contraseña = "1234567890";
Scanner scanner = new Scanner(System.in);
String entrada;

do {
    System.out.print("Introduce la contraseña: ");
    entrada = scanner.nextLine();
} while (!entrada.equals(contraseña));

System.out.println("contraseña correcta.");
scanner.close();
}