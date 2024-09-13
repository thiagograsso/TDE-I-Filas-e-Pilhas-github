
public class Elemento {
    String id;
    String descricao;
    String extraInfo; // Pode ser data, hora ou motivo, dependendo do contexto

    public Elemento(String id, String descricao, String extraInfo) {
        this.id = id;
        this.descricao = descricao;
        this.extraInfo = extraInfo;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Descrição: " + descricao + ", Info: " + extraInfo;
    }
}
