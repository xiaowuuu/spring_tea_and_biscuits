package com.codeclan.example.teaservice.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//package com.codeclan.example.teaservice.configs;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class SpringGlobalConfig implements WebMvcConfigurer {
//
//    private static final String CORS_BASE_PATTERN = "/**";
//    private static final String ALLOWED_ORIGINS = "http://localhost:5173/";
//    private static final String ALLOWED_HEADERS = "Authorization, Content-Type, X-Requested-With";
//    private static final String ALLOWED_METHODS = "GET, POST, PUT, DELETE";
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping(CORS_BASE_PATTERN)
//                .allowedOrigins(ALLOWED_ORIGINS)
//                .allowedHeaders(ALLOWED_HEADERS)
//                .allowedMethods(ALLOWED_METHODS);
//    }
//}
@Configuration
public class SpringGlobalConfig implements WebMvcConfigurer {

    private static final String CORS_BASE_PATTERN = "/**";
    private static final String ALLOWED_ORIGINS = "*";
    private static final String ALLOWED_HEADERS = "*";
    private static final String ALLOWED_METHODS = "*";

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping(CORS_BASE_PATTERN)
                .allowedOrigins(ALLOWED_ORIGINS)
                .allowedHeaders(ALLOWED_HEADERS)
                .allowedMethods(ALLOWED_METHODS);
    }
}