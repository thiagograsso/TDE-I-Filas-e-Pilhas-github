// Classe para implementar a fila usando lista encadeada
public class Fila {
    private Node frente;
    private Node tras;

    public Fila() {
        this.frente = null;
        this.tras = null;
    }

    // Adicionar cliente à fila (enqueue)
    public void enqueue(Elemento elemento) {
        Node novoNode = new Node(elemento);
        if (tras != null) {
            tras.proximo = novoNode;
        }
        tras = novoNode;
        if (frente == null) {
            frente = tras;
        }
    }

    // Atender o próximo cliente (dequeue)
    public Elemento dequeue() {
        if (frente == null) {
            System.out.println("Fila de atendimento vazia!");
            return null;
        }
        Elemento atendido = frente.elemento;
        frente = frente.proximo;
        if (frente == null) {
            tras = null;
        }
        return atendido;
    }

    // Mostrar fila de clientes
    public void mostrarFila() {
        Node atual = frente;
        while (atual != null) {
            System.out.println(atual.elemento);
            atual = atual.proximo;
        }
    }
}
