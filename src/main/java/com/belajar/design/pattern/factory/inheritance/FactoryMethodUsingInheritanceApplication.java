package com.belajar.design.pattern.factory.inheritance;

import com.belajar.design.pattern.factory.SocialMedia;
import com.belajar.design.pattern.factory.social_media.FacebookSocialMedia;
import com.belajar.design.pattern.factory.social_media.InstagramSocialMedia;
import com.belajar.design.pattern.factory.social_media.TikTokSocialMedia;
import com.belajar.design.pattern.factory.social_media.TwitterSocialMedia;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryMethodUsingInheritanceApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaFacebook() {
        return new FacebookSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaTwitter() {
        return new TwitterSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaInstagram() {
        return new InstagramSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaTikTok() {
        return new TikTokSocialMedia();
    }
}
