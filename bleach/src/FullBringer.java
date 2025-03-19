public class FullBringer extends SerEspiritual{

    private final String fullbring;

    public FullBringer(String nome, String posicao, String fullbring){
        super(nome, posicao);
        this.fullbring = fullbring;

    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Posição: " + getPosicao());
        System.out.println("Fullbringer: " + fullbring);
    }
}
