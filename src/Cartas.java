
public class Cartas {
    String naipe;
    String valor;

    // CONSTRUTOR
    public Cartas(String naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
    }
    // GETTERS
    public String getNaipe() {
        return naipe;
    }
    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
    String simbolo = "";
    switch (naipe.toLowerCase()) {
        case "espadas": simbolo = "♠"; break;
        case "paus": simbolo = "♣"; break;
        case "copas": simbolo = "♥"; break;
        case "ouros": simbolo = "♦"; break;
    }
    return valor + simbolo;
}
}
