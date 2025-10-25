package main;

public interface GerenciadorMidiaSocial {
    Publicacao publicar(Conteudo conteudo);
    Estatisticas buscarEstatisticas(String idPublicacao);
}
