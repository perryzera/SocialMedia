package apis;

public class TikTokAPI {
    public String postarVideo(String descricao) {
        System.out.println("[TikTok] Postando vídeo: " + descricao);
        return "tik999";
    }

    public int[] analise(String id) {
        return new int[]{500, 80};
    }
}