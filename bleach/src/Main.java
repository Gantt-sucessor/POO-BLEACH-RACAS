public class Main {

    public static void main(String[] args) {

        SerEspiritual humano = new Humano("Marcos", "Engenheiro");

        humano.mostrarPoder();

        Shinigami shinigami = new Shinigami("Zaraki Kempanchi ", "Capitão da 11 divisão", "Beba Nozarachi ", " Sem nome");

        shinigami.mostrarPoder();

        Hollow hollow = new Hollow("Starkk", "1 Espada", "Cero Metralleta", "Los lobos");

        hollow.mostrarPoder();

        Quincy quincy = new Quincy("Jugram", "Braço direito do rei Quincy", "B - A Balança", "Sem nome");

        quincy.mostrarPoder();

        FullBringer fullbringer = new FullBringer("Tsushikima", "Arrombado", "Book of the end");

        fullbringer.mostrarPoder();
    }
}
