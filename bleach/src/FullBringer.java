public class FullBringer extends SerEspiritual{

    private final String fullbriing;

    public FullBringer(String nome, String posicao, String fullbring){
        super(nome, posicao);
        this.fullbriing = fullbring;

    }

    @Override
    public void mostrarPoder(){
        System.out.println(getNome() + " " + getPosicao() + " usa seu Fullbring: " + fullbriing);
    }
}
