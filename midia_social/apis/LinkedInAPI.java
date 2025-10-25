package apis;

public class LinkedInAPI {
    public String compartilharPost(String conteudo) {
        System.out.println("[LinkedIn] Compartilhando post: " + conteudo);
        return "link789";
    }

    public int[] dadosPublicacao(String id) {
        return new int[]{70, 15};
    }
}