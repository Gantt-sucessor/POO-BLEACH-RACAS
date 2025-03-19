public class Quincy extends SerEspiritual{

    private final String schritt;
    private final String vollstandig;

    public Quincy(String nome, String posicao, String schritt, String vollstandig){
        super(nome, posicao);
        this.schritt = schritt;
        this.vollstandig = vollstandig;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Posição: " + getPosicao());
        System.out.println("Schritt: " + schritt);
        System.out.println("Vollstanding: " + vollstandig);
    }
}
