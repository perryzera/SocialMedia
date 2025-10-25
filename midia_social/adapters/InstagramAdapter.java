package adapters;

import apis.InstagramAPI;
import main.*;

public class InstagramAdapter implements GerenciadorMidiaSocial {
    private InstagramAPI api;

    public InstagramAdapter(InstagramAPI api) {
        this.api = api;
    }

    @Override
    public Publicacao publicar(Conteudo conteudo) {
        String id = api.postarLegenda(conteudo.getTexto(), conteudo.getImagemUrl());
        return new Publicacao(id, conteudo.getTexto());
    }

    @Override
    public Estatisticas buscarEstatisticas(String idPublicacao) {
        int[] dados = api.estatisticas(idPublicacao);
        return new Estatisticas(dados[0], dados[1]);
    }
}