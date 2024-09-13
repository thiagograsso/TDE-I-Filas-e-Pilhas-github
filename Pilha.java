// Classe para implementar a pilha usando lista encadeada
public class Pilha {
    private Node topo;

    public Pilha() {
        this.topo = null;
    }

    // Adicionar elemento na pilha (push)
    public void push(Elemento elemento) {
        Node novoNode = new Node(elemento);
        if (topo != null) {
            novoNode.proximo = topo;
        }
        topo = novoNode;
    }

    // Remover elemento da pilha (pop)
    public Elemento pop() {
        if (topo == null) {
            System.out.println("Histórico vazio!");
            return null;
        }
        Elemento removido = topo.elemento;
        topo = topo.proximo;
        return removido;
    }

    // Mostrar elementos do histórico
    public void mostrarHistorico() {
        Node atual = topo;
        while (atual != null) {
            System.out.println(atual.elemento);
            atual = atual.proximo;
        }
    }
}
