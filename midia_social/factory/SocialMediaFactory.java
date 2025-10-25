package factory;

import adapters.*;
import apis.*;
import main.GerenciadorMidiaSocial;

public class SocialMediaFactory {
    public static GerenciadorMidiaSocial criar(String plataforma) {
        switch (plataforma.toLowerCase()) {
            case "twitter":
                return new TwitterAdapter(new TwitterAPI());
            case "instagram":
                return new InstagramAdapter(new InstagramAPI());
            case "linkedin":
                return new LinkedInAdapter(new LinkedInAPI());
            case "tiktok":
                return new TikTokAdapter(new TikTokAPI());
            default:
                throw new IllegalArgumentException("Plataforma desconhecida: " + plataforma);
        }
    }
}
