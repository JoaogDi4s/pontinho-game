import java.util.ArrayList;
import java.util.List;

public class Lixo {
    private List<Cartas> descarte;

    public Lixo() {
        this.descarte = new ArrayList<>();
    }

    // Adiciona carta ao lixo
    public void adicionarCarta(Cartas carta) {
        descarte.add(carta);
    }

    // Pega a última carta descartada (topo)
    public Cartas verTopo() {
        if (!descarte.isEmpty()) {
            return descarte.get(descarte.size() - 1);
        }
        return null;
    }

    // Ver todas as cartas descartadas
    public List<Cartas> getDescarte() {
        return descarte;
    }

    // Dar ultima carta ao jogar
    public Cartas comprarLixo() {
        if (!descarte.isEmpty()) {
            return descarte.remove(descarte.size()-1);
        }
    return null;
    } 

    @Override
    public String toString() {
        return "Descarte: " + descarte;
    }
}
