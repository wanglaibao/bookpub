package com.laibao.bookpub.commandlinerunner;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;

import java.util.Collections;

public class StartupRunner implements CommandLineRunner {
    private final Log logger = LogFactory.getLog(StartupRunner.class);

    /**
     * the method below will be called by Spring Boot only once
     * after the application has started
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String[] args) throws Exception {
        logger.info("the first CommandLineRunner java class");
        if (ArrayUtils.isEmpty(args)) {
            logger.info("There is no commandLine arguments");
        }else {
            logger.info("There is some commandLine arguments");
        }
        logger.info("Hello, I am here!!!!!!!");
    }
}
