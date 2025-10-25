package apis;

public class InstagramAPI {
    public String postarLegenda(String texto, String imagemUrl) {
        System.out.println("[Instagram] Postando: " + texto + " (img: " + imagemUrl + ")");
        return "insta456";
    }

    public int[] estatisticas(String id) {
        return new int[]{120, 30};
    }
}