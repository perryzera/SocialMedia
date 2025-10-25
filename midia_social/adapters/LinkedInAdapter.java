package adapters;

import apis.LinkedInAPI;
import main.*;

public class LinkedInAdapter implements GerenciadorMidiaSocial {
    private LinkedInAPI api;

    public LinkedInAdapter(LinkedInAPI api) {
        this.api = api;
    }

    @Override
    public Publicacao publicar(Conteudo conteudo) {
        String id = api.compartilharPost(conteudo.getTexto());
        return new Publicacao(id, conteudo.getTexto());
    }

    @Override
    public Estatisticas buscarEstatisticas(String idPublicacao) {
        int[] dados = api.dadosPublicacao(idPublicacao);
        return new Estatisticas(dados[0], dados[1]);
    }
}