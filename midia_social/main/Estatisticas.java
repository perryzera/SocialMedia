package main;

public class Estatisticas {
    private int curtidas;
    private int comentarios;

    public Estatisticas(int curtidas, int comentarios) {
        this.curtidas = curtidas;
        this.comentarios = comentarios;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getComentarios() {
        return comentarios;
    }
}
