package com.belajar.design.pattern.factory.model2;

import com.belajar.design.pattern.factory.SocialMedia;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = FactoryMethod2Application.class)
class FactoryMethod2ApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testFactoryMathod() {
        SocialMedia facebook = applicationContext.getBean("socialMediaFacebook", SocialMedia.class);
        SocialMedia instagram = applicationContext.getBean("socialMediaInstagram", SocialMedia.class);
        SocialMedia tiktok = applicationContext.getBean("socialMediaTikTok", SocialMedia.class);
        SocialMedia twitter = applicationContext.getBean("socialMediaTwitter", SocialMedia.class);

        System.out.println(facebook);
        System.out.println(instagram);
        System.out.println(tiktok);
        System.out.println(twitter);
    }
}