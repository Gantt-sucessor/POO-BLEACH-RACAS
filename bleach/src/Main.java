import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        ArrayList<SerEspiritual>serEspiritual = new ArrayList<>();

        while (true) {
            
            System.out.println("1- Shinigami");
            System.out.println("2- Hollow");
            System.out.println("3- Quincy");
            System.out.println("4- Fullbringer");
            System.out.printf("Informe a raça que deseja cadastrar: ");
            int escolha = input.nextInt();
            input.nextLine();

            switch (escolha) {
                case 1:
                    
                    serEspiritual.add(new Shinigami(null, null, null, null));
                    break;
                case 2:

                    serEspiritual.add(new Hollow(null, null, null, null));

                    break;
                
                case 3:

                    serEspiritual.add(new Quincy(null, null, null, null));
                    break;

                
                case 4:

                    serEspiritual.add(new FullBringer(null, null, null));
                    break;

                default:

                    System.out.println("Opçao invalida!!");
                    break;
            }
        }

    }
}
