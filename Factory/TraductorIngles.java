package Factory;
public class TraductorIngles extends Traductor {
    public TraductorIngles() {
        super();
    }
    @Override
    public String traducirNumero(int numero) {
        String s = null;
        switch (numero) {
            case 1:
                s = "one";
                break;
            case 2:
                s = "two";
                break;
        }
        return s;
    }
}
