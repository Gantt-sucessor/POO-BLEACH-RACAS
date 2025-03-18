public class Hollow extends SerEspiritual{

        private final String cero;
        private final String resurrection;

        public Hollow(String nome, String posicao, String cero, String resurrection){
            super(nome, posicao);
            this.cero = cero;
            this.resurrection = resurrection;
        }

        @Override
        public void mostrarPoder(){
            System.out.println(getPosicao() + " " + getNome() + "usa seu: " + cero + " e ativa sua ressurrection: " + resurrection);
        }

}
