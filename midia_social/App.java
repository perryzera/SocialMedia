import factory.SocialMediaFactory;
import main.*;

public class App {
    public static void main(String[] args) {
        String plataforma = "tiktok"; // escolha dinâmica
        GerenciadorMidiaSocial gerenciador = SocialMediaFactory.criar(plataforma);

        Conteudo conteudo = new Conteudo("Desafio de dança!", "video.mp4");

        Publicacao post = gerenciador.publicar(conteudo);
        System.out.println("Publicação criada com ID: " + post.getId());

        Estatisticas stats = gerenciador.buscarEstatisticas(post.getId());
        System.out.println("Curtidas: " + stats.getCurtidas() + " | Comentários: " + stats.getComentarios());
    }
}
