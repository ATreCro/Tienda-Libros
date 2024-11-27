package holatiendalibros;


import java.util.Scanner;


public class HolaTiendaLibros {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduzca un titulo de libro: ");
        var titulo = consola.nextLine();
        System.out.println("Introduzca una ID del libro: ");
        var id = consola.nextInt();
        System.out.println("Introduzca el precio del libro: ");
        double precio = consola.nextDouble();
        
        System.out.println("¿Se envia gratuitamente: ? true/false");
        var envio = consola.nextBoolean();
        
        System.out.println("Aquí los datos de tu libro: " + titulo + " " + id + " " + precio + " " + envio);
      
        
        /*solucion
        
        import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
 
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
        */
        
    }
    
}
