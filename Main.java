
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Agenda agenda = new Agenda();

        int opcao;

        do {

            System.out.println("\n===== AGENDA DE CONTATOS =====");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Remover contato");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.print("E-mail: ");
                    String email = scanner.nextLine();

                    Contato contato = new Contato(nome, telefone, email);

                    agenda.adicionarContato(contato);

                    break;

                case 2:

                    agenda.listarContatos();

                    break;

                case 3:

                    System.out.print("Digite o nome para buscar: ");
                    nome = scanner.nextLine();

                    agenda.buscarPorNome(nome);

                    break;

                case 4:

                    System.out.print("Digite o nome para remover: ");
                    nome = scanner.nextLine();

                    agenda.removerContato(nome);

                    break;

                case 0:

                    System.out.println("Encerrando agenda...");

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
