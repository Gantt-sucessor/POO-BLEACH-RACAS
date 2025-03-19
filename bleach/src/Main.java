import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<SerEspiritual> personagens = new ArrayList<>();

        while (true){

            System.out.println("\nCadastro de Personagens Bleach");
            System.out.println("1 - Cadastrar Shinigami");
            System.out.println("2 - Cadastrar Hollow");
            System.out.println("3 - Cadastrar Quincy");
            System.out.println("4 - Cadastrar Fullbringer");
            System.out.println("5 - Cadastrar Humano");
            System.out.println("6 - Listar Personagens");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = input.nextInt();

            input.nextLine();

            switch (opcao){

                case 1:
                    System.out.print("Nome: ");
                    String nomeShinigami = input.nextLine();
                    System.out.print("Posição (ex: Capitão, Tenente): ");
                    String posicaoShinigami = input.nextLine();
                    System.out.print("Shikai: ");
                    String shikai = input.nextLine();
                    System.out.print("Bankai: ");
                    String bankai = input.nextLine();


                    personagens.add(new Shinigami(nomeShinigami,posicaoShinigami,shikai,bankai));
                    System.out.println("Shinigami cadastrado com sucesso!!");

                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeHollow = input.nextLine();
                    System.out.print("Posição: ");
                    String posicaoHollow = input.nextLine();
                    System.out.print("Cero: ");
                    String cero = input.nextLine();
                    System.out.print("Resurrection: ");
                    String resurrection = input.nextLine();


                    personagens.add(new Hollow(nomeHollow, posicaoHollow, cero, resurrection));
                    System.out.println("Hollow cadastrado com sucesso!!");

                    break;

                case 3:
                    System.out.print("Nome: ");
                    String nomeQuincy = input.nextLine();
                    System.out.print("Posição: ");
                    String posicaoQuincy = input.nextLine();
                    System.out.print("Schritt: ");
                    String schritt = input.nextLine();
                    System.out.print("Vollstandig: ");
                    String vollstandig = input.nextLine();


                    personagens.add(new Quincy(nomeQuincy, posicaoQuincy, schritt, vollstandig));
                    System.out.println("Quincy cadastrado com sucesso!!");

                    break;

                case 4:
                    System.out.print("Nome: ");
                    String nomeFullbringer = input.nextLine();
                    System.out.print("Posição: ");
                    String posicaoFullbringer = input.nextLine();
                    System.out.print("Fullbring: ");
                    String fullbring = input.nextLine();


                    personagens.add(new FullBringer(nomeFullbringer, posicaoFullbringer, fullbring));
                    System.out.println("Fullbringer cadastrado com sucesso!!");

                    break;

                case 5:
                    System.out.print("Nome: ");
                    String nomeHumano = input.nextLine();
                    System.out.print("Posição: ");
                    String posicaoHumano= input.nextLine();


                    personagens.add(new Humano(nomeHumano, posicaoHumano));
                    System.out.println("Humano");

                    break;

                case 6:
                    System.out.println("\nPersonagens Cadastrados: ");
                    for(SerEspiritual p: personagens){
                        p.mostrarInformacoes();
                        System.out.println("---------------");
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    input.close();
                    return;

                default:
                    System.out.println("Opção invalida");
            }
        }

    }
}
