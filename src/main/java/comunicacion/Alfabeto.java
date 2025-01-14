package comunicacion;

public class Alfabeto extends Escrito {
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen, null, null, letras.length);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public Alfabeto() {
        super("", "", "", 0);
        this.letras = new String[0];
        this.interpretacion = "";
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras() {
        return letras.length;
    }

    @Override
    public int palabrasTotales(int factor) {
        return cantidadLetras();
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return String.join(", ", letras);
    }
}