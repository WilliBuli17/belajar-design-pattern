package com.belajar.design.pattern.factory.model1;

import com.belajar.design.pattern.factory.SocialMedia;
import com.belajar.design.pattern.factory.SocialMediaType;
import com.belajar.design.pattern.factory.socialmedia.FacebookSocialMedia;
import com.belajar.design.pattern.factory.socialmedia.InstagramSocialMedia;
import com.belajar.design.pattern.factory.socialmedia.TikTokSocialMedia;
import com.belajar.design.pattern.factory.socialmedia.TwitterSocialMedia;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryMethod1Application {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMedia(SocialMediaType type){

        switch (type){
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
