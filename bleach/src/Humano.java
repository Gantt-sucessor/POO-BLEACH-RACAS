public class Humano extends SerEspiritual{

    public Humano(String nome, String posicao){
        super(nome, posicao);

    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Posição: " + getPosicao());
        System.out.println("Não tem poder especial");
    }
}
