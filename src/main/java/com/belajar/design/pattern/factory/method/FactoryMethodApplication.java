package com.belajar.design.pattern.factory.method;

import com.belajar.design.pattern.factory.SocialMedia;
import com.belajar.design.pattern.factory.SocialMediaType;
import com.belajar.design.pattern.factory.social_media.FacebookSocialMedia;
import com.belajar.design.pattern.factory.social_media.InstagramSocialMedia;
import com.belajar.design.pattern.factory.social_media.TikTokSocialMedia;
import com.belajar.design.pattern.factory.social_media.TwitterSocialMedia;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryMethodApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMedia(SocialMediaType type) {

        switch (type) {
            case FACEBOOK:
                return new FacebookSocialMedia();
            case TIKTOK:
                return new TikTokSocialMedia();
            case INSTAGRAM:
                return new InstagramSocialMedia();
            case TWITTER:
                return new TwitterSocialMedia();
            default:
                throw new IllegalArgumentException("Unsupported Social Media Type");
        }
    }
}
