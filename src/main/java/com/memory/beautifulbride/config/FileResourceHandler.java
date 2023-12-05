package com.memory.beautifulbride.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class FileResourceHandler implements WebMvcConfigurer {

    private final String IMGFOLDER = "/BB_IMG";

    @Value("${WeddingDressImgPath}")
    private String WeddingDressImgPath;

    @Value("${MemberImgPath}")
    private String MemberImgPath;

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**")
                .addResourceLocations("file:///BB_Image/");
        registry.addResourceHandler("/images/" + WeddingDressImgPath + "**");
        registry.addResourceHandler("/images/" + MemberImgPath + "**");
    }
}
