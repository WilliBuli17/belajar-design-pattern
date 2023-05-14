package com.belajar.design.pattern.factory.socialmedia;

import com.belajar.design.pattern.factory.SocialMedia;
import com.belajar.design.pattern.factory.SocialMediaType;
import lombok.Data;

@Data
public class TwitterSocialMedia implements SocialMedia {

    private final String name = String.valueOf(SocialMediaType.TWITTER);
    private final String link = "https://www.twitter.com/";
    private final SocialMediaType type = SocialMediaType.TWITTER;
}
