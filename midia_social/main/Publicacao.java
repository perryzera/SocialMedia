package main;

public class Publicacao {
    private String id;
    private String mensagem;

    public Publicacao(String id, String mensagem) {
        this.id = id;
        this.mensagem = mensagem;
    }

    public String getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }
}
