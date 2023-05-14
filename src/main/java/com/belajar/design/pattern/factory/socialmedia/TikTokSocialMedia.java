package com.belajar.design.pattern.factory.socialmedia;

import com.belajar.design.pattern.factory.SocialMedia;
import com.belajar.design.pattern.factory.SocialMediaType;
import lombok.Data;

@Data
public class TikTokSocialMedia implements SocialMedia {

    private final String name = String.valueOf(SocialMediaType.TIKTOK);
    private final String link = "https://www.tiktok.com/";
    private final SocialMediaType type = SocialMediaType.TIKTOK;
}
