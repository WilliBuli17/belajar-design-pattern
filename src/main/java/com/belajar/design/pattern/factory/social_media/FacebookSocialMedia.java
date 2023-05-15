package com.belajar.design.pattern.factory.social_media;

import com.belajar.design.pattern.factory.SocialMedia;
import com.belajar.design.pattern.factory.SocialMediaType;
import lombok.Data;

@Data
public class FacebookSocialMedia implements SocialMedia {

    private final String name = String.valueOf(SocialMediaType.FACEBOOK);
    private final String link = "https://www.facebook.com/";
    private final SocialMediaType type = SocialMediaType.FACEBOOK;
}
