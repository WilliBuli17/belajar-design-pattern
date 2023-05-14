package com.belajar.design.pattern.factory.model1;

import com.belajar.design.pattern.factory.SocialMedia;
import com.belajar.design.pattern.factory.SocialMediaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = FactoryMethod1Application.class)
class FactoryMethod1ApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testFactoryMethod() {
        SocialMedia facebook = applicationContext.getBean(SocialMedia.class, SocialMediaType.FACEBOOK);
        SocialMedia twitter = applicationContext.getBean(SocialMedia.class, SocialMediaType.TWITTER);
        SocialMedia instagram = applicationContext.getBean(SocialMedia.class, SocialMediaType.INSTAGRAM);
        SocialMedia tiktok = applicationContext.getBean(SocialMedia.class, SocialMediaType.TIKTOK);
//        SocialMedia other = applicationContext.getBean(SocialMedia.class, SocialMediaType.OTHER);

        System.out.println(facebook);
        System.out.println(twitter);
        System.out.println(instagram);
        System.out.println(tiktok);
//        System.out.println(other);
    }
}
