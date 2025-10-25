package adapters;

import apis.TikTokAPI;
import main.*;

public class TikTokAdapter implements GerenciadorMidiaSocial {
    private TikTokAPI api;

    public TikTokAdapter(TikTokAPI api) {
        this.api = api;
    }

    @Override
    public Publicacao publicar(Conteudo conteudo) {
        String id = api.postarVideo(conteudo.getTexto());
        return new Publicacao(id, conteudo.getTexto());
    }

    @Override
    public Estatisticas buscarEstatisticas(String idPublicacao) {
        int[] dados = api.analise(idPublicacao);
        return new Estatisticas(dados[0], dados[1]);
    }
}

