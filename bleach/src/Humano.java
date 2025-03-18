public class Humano extends SerEspiritual{

    public Humano(String nome, String posicao){
        super(nome, posicao);

    }

    @Override
    public void mostrarPoder(){
        System.out.println(getNome() + " não tem habilidade especial");
    }
}
