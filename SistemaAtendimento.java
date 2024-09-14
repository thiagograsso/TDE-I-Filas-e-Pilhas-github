public class SistemaAtendimento {
    public static void main(String[] args) {
        Fila filaAtendimento = new Fila();
        Pilha historicoSolicitacoes = new Pilha();

        // Exemplo de como adicionar clientes à fila e solicitar o atendimento
        filaAtendimento.enqueue(new Elemento("CLI001", "Maria Silva", "Dúvida sobre produto"));
        filaAtendimento.enqueue(new Elemento("CLI002", "João Souza", "Reclamação de serviço"));
        filaAtendimento.enqueue(new Elemento("CLI003", "Ana Costa", "Solicitação de reembolso"));

        System.out.println("\n--- Fila de Atendimento ---");
        filaAtendimento.mostrarFila();

        System.out.println("\nAtendendo o primeiro cliente...");
        filaAtendimento.dequeue();

        System.out.println("\n--- Fila de Atendimento após o atendimento ---");
        filaAtendimento.mostrarFila();

        // Exemplo de como adicionar solicitações ao histórico
        historicoSolicitacoes.push(new Elemento("REQ001", "Instalação de software", "2024-08-20 10:30"));
        historicoSolicitacoes.push(new Elemento("REQ002", "Manutenção preventiva", "2024-08-20 11:00"));

        System.out.println("\n--- Histórico de Solicitações ---");
        historicoSolicitacoes.mostrarPilha();

        System.out.println("\nRemovendo a última solicitação...");
        historicoSolicitacoes.pop();

        System.out.println("\n--- Histórico de Solicitações após a remoção ---");
        historicoSolicitacoes.mostrarPilha();
    }
}
