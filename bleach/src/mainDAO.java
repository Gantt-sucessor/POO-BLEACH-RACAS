import java.util.Scanner;

public class mainDAO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SerEspiritualDAO dao = new SerEspiritualDAO();

        while (true) {
            System.out.println("\nCadastro de Personagens Bleach");
            System.out.println("1. Cadastrar Shinigami");
            System.out.println("2. Listar Shinigamis");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Posição: ");
                String posicao = scanner.nextLine();
                System.out.print("Shikai: ");
                String shikai = scanner.nextLine();
                System.out.print("Bankai: ");
                String bankai = scanner.nextLine();

                Shinigami shinigami = new Shinigami(nome, posicao, shikai, bankai);
                dao.inserirShinigami(shinigami);
                System.out.println("Shinigami cadastrado com sucesso!");
            }
            else if (opcao == 2) {
                for (Shinigami s : dao.listarShinigamis()) {
                    s.mostrarInformacoes();
                    System.out.println("----------------------");
                }
            }
            else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            }
            else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
