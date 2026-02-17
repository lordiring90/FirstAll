import java.util.Scanner; // 1. Importamos la herramienta para leer el teclado

public class Principal {
    public static void main(String[] args) {
        // 2. Creamos el "lector"
        Scanner lector = new Scanner(System.in);

        // 3. Pedimos un dato (String = Texto)
        System.out.println("¿Cómo te llamas?");
        String nombre = lector.nextLine();

        // 4. Pedimos un número (int = Entero)
        System.out.println("¿Cuántos años tienes?");
        int edad = lector.nextInt();

        // 5. Mostramos el resultado combinando texto y variables
        System.out.println("Hola " + nombre + ", el próximo año tendrás " + (edad + 1) + " años.");

        lector.close(); // Buena práctica: cerrar el lector al terminar

        //Nuevo aqui yo miro
        String Name = "Legolas";
        int Edad2 = 30;
        double dinero = 0.05;

        //usaremos la salida del sistema para ver si esto si sale
        System.out.println("un personaje nuevo a continuacion ->");
        System.out.println("Se llama " + Name);
        System.out.println("Tiene "+ Edad2 + " años");
        System.out.println("En su cuenta bancaria tiene: " + dinero + " De dollars");





    }
}