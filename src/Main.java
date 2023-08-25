// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Producto libro1 = new Producto("La casita", 100, 75, 3);

        System.out.println(libro1.getNombre());
        System.out.println(libro1.hayStock());
        System.out.println(libro1.ganancia());

        }
    }