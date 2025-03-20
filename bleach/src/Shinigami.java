public class Shinigami extends SerEspiritual{
    private final String shikai;
    private final String bankai;

    public Shinigami(String nome, String posicao, String shikai, String bankai){
        super(nome, posicao);
        this.shikai = shikai;
        this.bankai = bankai;
    }

    public String getShikai() {
        return shikai;
    }

    public String getBankai() {
        return bankai;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Posição: " + getPosicao());
        System.out.println("Shikai: " + shikai);
        System.out.println("Bankai: " + bankai);
    }
}
