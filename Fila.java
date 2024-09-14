public class Fila {
    private Node frente;
    private Node tras;

    public Fila() {
        this.frente = null;
        this.tras = null;
    }

    // Método para adicionar um cliente à fila
    public void enqueue(Elemento cliente) {
        Node novoNo = new Node(cliente);
        if (tras == null) {  // Fila vazia
            frente = tras = novoNo;
        } else {
            tras.proximo = novoNo;
            tras = novoNo;
        }
        System.out.println("Cliente adicionado à fila: " + cliente.descricao);
    }

    // Método para remover e atender o próximo cliente da fila
    public Elemento dequeue() {
        if (frente == null) {
            System.out.println("A fila está vazia! Nenhum cliente para atender.");
            return null;
        }
        Elemento clienteAtendido = frente.elemento;
        frente = frente.proximo;
        if (frente == null) {
            tras = null; // A fila ficou vazia
        }
        System.out.println("Cliente atendido com sucesso: " + clienteAtendido.descricao);
        return clienteAtendido;
    }

    // Método para exibir todos os clientes na fila
    public void mostrarFila() {
        if (frente == null) {
            System.out.println("A fila está vazia.");
        } else {
            Node atual = frente;
            while (atual != null) {
                System.out.println("ID: " + atual.elemento.id + ", Descrição: " + atual.elemento.descricao + ", Info: " + atual.elemento.info);
                atual = atual.proximo;
            }
        }
    }
}
