package com.laibao.bookpub.configuration;

import com.laibao.bookpub.commandlinerunner.SecondRunner;
import com.laibao.bookpub.commandlinerunner.StartupRunner;
import com.laibao.bookpub.commandlinerunner.ThirdRunner;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author laibao wang
 * @date 2018-01-26
 * @version 1.0
 */
@Configuration
@EnableScheduling
public class AppConfiguration {

    @Bean
    public StartupRunner startupRunner() {
        return new StartupRunner();
    }

    @Bean
    public SecondRunner secondRunner() {
        return new SecondRunner();
    }

    @Bean
    public ThirdRunner ThirdRunner() {
        return new ThirdRunner();
    }
}
