public class Pilha {
    private Node topo;

    public Pilha() {
        this.topo = null;
    }

    // Método para adicionar uma solicitação ao histórico
    public void push(Elemento solicitacao) {
        Node novoNo = new Node(solicitacao);
        novoNo.proximo = topo;
        topo = novoNo;
        System.out.println("Solicitação adicionada ao histórico: " + solicitacao.descricao);
    }

    // Método para remover a última solicitação do histórico
    public Elemento pop() {
        if (topo == null) {
            System.out.println("O histórico está vazio! Nenhuma solicitação para remover.");
            return null;
        }
        Elemento solicitacaoRemovida = topo.elemento;
        topo = topo.proximo;
        System.out.println("Solicitação removida do histórico: " + solicitacaoRemovida.descricao);
        return solicitacaoRemovida;
    }

    // Método para exibir todas as solicitações no histórico
    public void mostrarPilha() {
        if (topo == null) {
            System.out.println("O histórico está vazio.");
        } else {
            Node atual = topo;
            while (atual != null) {
                System.out.println("ID: " + atual.elemento.id + ", Descrição: " + atual.elemento.descricao + ", Info: " + atual.elemento.info);
                atual = atual.proximo;
            }
        }
    }
}
