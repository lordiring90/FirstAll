import java.util.Scanner; // Siempre arriba de todo

public class Principal {
    public static void main(String[] args) {
        //Todo tu código debe vivir aquí adentro
        Scanner lector = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?");
        String nombre = lector.nextLine();

        System.out.println("¿Cuántos años tienes?");
        int edad = lector.nextInt();

        System.out.println("Hola " + nombre + ", el próximo año tendrás " + (edad + 1) + " años.");

        lector.close();
    }
} // Esta es la llave que cierra la Clase. No debe haber nada después de esta.