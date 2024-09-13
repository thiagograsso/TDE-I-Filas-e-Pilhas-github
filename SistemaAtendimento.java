import java.io.*;
import java.util.*;

public class SistemaAtendimento {
    public static void main(String[] args) {
        Fila filaAtendimento = new Fila();
        Pilha historicoSolicitacoes = new Pilha();

        // Ler elementos da fila de atendimento de um arquivo txt
        List<Elemento> filaAtendimentoArray = lerElementosDeArquivo("src/filaAtendimento.txt");
        for (Elemento cliente : filaAtendimentoArray) {
            filaAtendimento.enqueue(cliente);
        }

        // Ler elementos do histórico de solicitações de um arquivo txt
        List<Elemento> historicoArray = lerElementosDeArquivo("src/historico.txt");
        for (Elemento solicitacao : historicoArray) {
            historicoSolicitacoes.push(solicitacao);
        }

        // Exibir fila de atendimento
        System.out.println("Fila de Atendimento:");
        filaAtendimento.mostrarFila();

        // Atender clientes
        System.out.println("\nAtendendo o primeiro cliente...");
        filaAtendimento.dequeue();
        filaAtendimento.mostrarFila();

        // Exibir histórico de solicitações
        System.out.println("\nHistórico de Solicitações:");
        historicoSolicitacoes.mostrarHistorico();

        // Remover uma solicitação do histórico
        System.out.println("\nRemovendo a última solicitação...");
        historicoSolicitacoes.pop();
        historicoSolicitacoes.mostrarHistorico();
    }

    // Função para ler os elementos de um arquivo txt
    public static List<Elemento> lerElementosDeArquivo(String nomeArquivo) {
        List<Elemento> elementos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(","); // Separando por vírgula
                Elemento elemento = new Elemento(dados[0], dados[1], dados[2]);
                elementos.add(elemento);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return elementos;
    }
}
