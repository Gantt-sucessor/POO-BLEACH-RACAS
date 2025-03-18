public abstract class SerEspiritual {

    private final String nome;
    private final String posicao;

    public SerEspiritual(String nome, String posicao){
        this.nome = nome;
        this.posicao = posicao;
    }

    public String getNome(){
        return nome;
    }
    public String getPosicao(){
        return posicao;
    }

    public abstract void mostrarPoder();
}
