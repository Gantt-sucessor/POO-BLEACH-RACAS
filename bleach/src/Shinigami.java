public class Shinigami extends SerEspiritual{
    private final String shikai;
    private final String bankai;

    public Shinigami(String nome, String posicao, String shikai, String bankai){
        super(nome, posicao);
        this.shikai = shikai;
        this.bankai = bankai;
    }

    @Override
    public void mostrarPoder(){
        System.out.println(getNome() + "libera sua Shikai: " + shikai + "e sua bankai: " + bankai);
    }
}
