package com.belajar.design.pattern.factory.social_media;

import com.belajar.design.pattern.factory.SocialMedia;
import com.belajar.design.pattern.factory.SocialMediaType;
import lombok.Data;

@Data
public class InstagramSocialMedia implements SocialMedia {

    private final String name = String.valueOf(SocialMediaType.INSTAGRAM);
    private final String link = "https://www.instagram.com/";
    private final SocialMediaType type = SocialMediaType.INSTAGRAM;
}
