public class Hollow extends SerEspiritual{

        private final String cero;
        private final String resurrection;

        public Hollow(String nome, String posicao, String cero, String resurrection){
            super(nome, posicao);
            this.cero = cero;
            this.resurrection = resurrection;
        }

        public String getCero() {
            return cero;
    }

        public String getResurrection() {
            return resurrection;
    }
        @Override
        public void mostrarInformacoes(){
            System.out.println("Nome: " + getNome());
            System.out.println("Posição: " + getPosicao());
            System.out.println("Cero: " + cero);
            System.out.println("Resurrection: " + resurrection);
        }

}
