import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    public List<Cartas> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        // DEFINE OS NAIPES
        String[] naipes = {"Copas", "Ouros", "Paus", "Espadas"};
        
        // DEFINE OS VALORES  
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        // ADICIONA O PRIMEIRO DECK
        for (String naipe : naipes) {
            for (String valor : valores) {
                cartas.add(new Cartas(naipe, valor));
            }
        }

        // ADICIONA O SEGUNDA DECK   
        for (String naipe : naipes) {
            for (String valor : valores) {
                cartas.add(new Cartas(naipe, valor));
            }
        }

        // ADICIONA OS CORINGAS
        for (int i = 0; i<5; i++){
        cartas.add(new Cartas("", "Coringa"));
        }

    }

    // EMBARALHA O BARALHO
    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    // DA AS 9 CARTAS INICIAS PARA O JOGADOR
    public List<Cartas> iniciar() {
        List<Cartas> compradas = new ArrayList<>();
        for (int i = 0; i < 9 && !cartas.isEmpty(); i++) {
            compradas.add(cartas.remove(cartas.size()-1));
        }
        return compradas;
    }

    // COMPRA UMA CARTA DA MESA
    public Cartas comprarCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(cartas.size()-1);
        }
    return null;
    }


    public int cartasRestantes() {
        return cartas.size();
    }

    @Override
    public String toString() {
        return cartas.toString();
    }
}
