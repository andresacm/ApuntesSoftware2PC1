
package Factory;

public abstract class TraductorFactory {

    public TraductorFactory() {
    }
    public abstract Traductor MetodoFabrica();
    public static Traductor createTraductor(String idioma) {
        Traductor traductor = null;
        if ("español".equals(idioma)) {
            traductor = new FabricaTraductorEspañol().MetodoFabrica();
        }
        if ("ingles".equals(idioma)) {
            traductor = new FabricaTraductorIngles().MetodoFabrica();
        }
        return traductor;
    }
}
