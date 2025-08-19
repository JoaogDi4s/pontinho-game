import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogador {
    Scanner scan = new Scanner(System.in);
    // ATRIBUTORS
    private String nome;
    private int Pontos;
    private List<Cartas> mao;

    // CONSTRUTOR
    public Jogador(String nome){
        this.nome = nome;
        this.mao = new ArrayList<>();
    }

    // GETTERS
    public String getNome() {
        return nome;
    }
    public int getPontos() {
        return Pontos;
    }
     public List<Cartas> getMao() {
        return mao;
    }

    // SETTER
    public void setPontos(int pontos) {
        Pontos = pontos;
    } 
    
    // INICIA A MÃO DO JOGADOR
    public void iniciarMao(Baralho baralho) {
        for (int i = 0; i < 9; i++) {
            Cartas carta = baralho.comprarCarta();
            if (carta != null) {
                mao.add(carta);
            }
        }
    }
    // COMPRA UMA CARTA DA MESA
    public void comprar(Baralho baralho) {
    Cartas carta = baralho.comprarCarta();
        if (carta != null) {
            mao.add(carta);
        }
    }    

    public void comprarLixo(Lixo lixo){
        Cartas carta = lixo.comprarLixo();
        if (carta != null){
            mao.add(carta);
        }
    }
    // DESCARTAR
    public void descartar(Lixo lixo){
        System.out.println("Escolha uma carta para ser descartada: ");
        System.out.println(getMao());
        int posicao = scan.nextInt();
        Cartas cartaDescartada = mao.remove(posicao);
        lixo.adicionarCarta(cartaDescartada);
        System.out.println("Mão Atual : " + getMao());
    }

    // PRINTAR A MAO DO JOGADOR
    public String printarMao(){
        return nome + " Tem" + mao;
    }
}
