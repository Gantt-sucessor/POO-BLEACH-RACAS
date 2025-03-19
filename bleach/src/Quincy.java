public class Quincy extends SerEspiritual{

    private final String schritt;
    private final String vollstandig;

    public Quincy(String nome, String posicao, String schritt, String vollstandig){
        super(nome, posicao);
        this.schritt = schritt;
        this.vollstandig = vollstandig;
    }

    @Override
    public void mostrarPoder(){
        System.out.println(getNome() + " libera usa sua Schritt " + schritt + " e ativa sua: " + vollstandig);
    }
}
