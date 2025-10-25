package apis;

public class TwitterAPI {
    public String tweetar(String mensagem) {
        System.out.println("[Twitter] Publicando tweet: " + mensagem);
        return "tw123";
    }

    public int[] obterDados(String id) {
        return new int[]{50, 10}; // curtidas, comentarios
    }
}
