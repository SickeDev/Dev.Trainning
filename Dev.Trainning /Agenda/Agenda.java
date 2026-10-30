
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos = new ArrayList<>();

    // Adicionar contato
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    // Listar contatos
    public void listarContatos() {

        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
            return;
        }

        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    // Buscar contato pelo nome
    public void buscarPorNome(String nome) {

        for (Contato contato : contatos) {

            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println(contato);
                return;
            }
        }

        System.out.println("Contato não encontrado.");
    }

    // Remover contato
    public void removerContato(String nome) {

        for (Contato contato : contatos) {

            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatos.remove(contato);
                System.out.println("Contato removido com sucesso!");
                return;
            }
        }

        System.out.println("Contato não encontrado.");
    }
}
