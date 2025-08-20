
public class Cartas {
    String naipe;
    String valor;
    Integer valorID;
    Integer naipeID;

    // CONSTRUTOR
    public Cartas(String naipe, String valor, Integer valorID, Integer naipeID) {
        this.naipe = naipe;
        this.valor = valor;
        this.valorID = valorID;
        this.naipeID = naipeID;
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
