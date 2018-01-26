package com.laibao.bookpub.commandlinerunner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;

public class SecondRunner implements CommandLineRunner{
    private final Log logger = LogFactory.getLog(SecondRunner.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("I am the second CommandLineRunner java class");
    }
}
