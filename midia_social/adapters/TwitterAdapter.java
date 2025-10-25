package adapters;

import apis.TwitterAPI;
import main.*;

public class TwitterAdapter implements GerenciadorMidiaSocial {
    private TwitterAPI api;

    public TwitterAdapter(TwitterAPI api) {
        this.api = api;
    }

    @Override
    public Publicacao publicar(Conteudo conteudo) {
        String id = api.tweetar(conteudo.getTexto());
        return new Publicacao(id, conteudo.getTexto());
    }

    @Override
    public Estatisticas buscarEstatisticas(String idPublicacao) {
        int[] dados = api.obterDados(idPublicacao);
        return new Estatisticas(dados[0], dados[1]);
    }
}

