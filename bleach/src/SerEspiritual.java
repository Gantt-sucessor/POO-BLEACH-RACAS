public class SerEspiritual {

    private final String nome;
    private final String posicao;

    public SerEspiritual(String nome, String posicao){
        this.nome = nome;
        this.posicao = posicao;
    }

    public void mostrarInformações(){

        System.out.println("Nome: "+nome + "com posição" + posicao);
    }
}
