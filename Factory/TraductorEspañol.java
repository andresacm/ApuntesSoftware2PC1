package Factory;
public class TraductorEspañol extends Traductor {

    public TraductorEspañol() {
        super();
    }
    @Override
    public String traducirNumero(int numero) {
        String s = null;
        switch (numero) {
            case 1:
                s = "uno";
                break;
            case 2:
                s = "dos";
                break;
        }
        return s;
    }
}
