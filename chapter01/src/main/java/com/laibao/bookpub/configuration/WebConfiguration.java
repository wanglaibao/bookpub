package com.laibao.bookpub.configuration;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.theme.ThemeChangeInterceptor;

import java.util.concurrent.TimeUnit;

@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    public RemoteIpFilter remoteIpFilter() {
        System.err.println("我是金哥啊");
        return new RemoteIpFilter();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
        registry.addInterceptor(themeChangeInterceptor());
    }


    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        return new LocaleChangeInterceptor();
    }

    @Bean
    public ThemeChangeInterceptor themeChangeInterceptor() {
        return new ThemeChangeInterceptor();
    }

    public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer() {
        return (ConfigurableEmbeddedServletContainer container) -> {
            container.setSessionTimeout(1, TimeUnit.MINUTES);
        };
    }
}
