
public class Cartas {
    String naipe;
    String Valor;

    // CONSTRUTOR
    public Cartas(String naipe, String valor) {
        this.naipe = naipe;
        Valor = valor;
    }
    // GETTERS
    public String getNaipe() {
        return naipe;
    }
    public String getValor() {
        return Valor;
    }

    @Override
    public String toString() {
        return "Cartas [naipe=" + naipe + ", Valor=" + Valor + "]";
    }
}
