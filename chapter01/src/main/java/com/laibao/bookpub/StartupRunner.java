package com.laibao.bookpub;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;

import java.util.Collections;

public class StartupRunner implements CommandLineRunner {
    protected final Log logger = LogFactory.getLog(getClass());

    /**
     * the method below will be called by Spring Boot only once
     * after the application has started
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String[] args) throws Exception {
        if (ArrayUtils.isEmpty(args)) {
            logger.info("There is no commandLine arguments");
        }else {
            logger.info("There is some commandLine arguments");
        }
        logger.info("Hello, I am here!!!!!!!");
    }
}
