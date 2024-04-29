
package Factory;

public class Main {

    public static void main(String[] args) {
        Traductor traductor = TraductorFactory.createTraductor("español");
        System.out.println(traductor.traducirNumero(1));
        System.out.println(traductor.traducirNumero(2));
    }
}
