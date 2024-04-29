
package Factory;

public class FabricaTraductorIngles extends TraductorFactory {

    @Override
    public Traductor MetodoFabrica() {
        return new TraductorIngles();
    }
}
