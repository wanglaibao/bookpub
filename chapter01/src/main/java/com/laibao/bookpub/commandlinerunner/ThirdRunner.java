package com.laibao.bookpub.commandlinerunner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;

import javax.sql.DataSource;

public class ThirdRunner implements CommandLineRunner{
    private final Log logger = LogFactory.getLog(ThirdRunner.class);

    @Autowired
    @Qualifier("dataSource")            //为什么必须要这样呢？ 不这样的话 有一个奇怪的问题
    private DataSource dataSource;

    @Override
    public void run(String... args) throws Exception {
        logger.info("I am the third CommandLineRunner java class");
        logger.info("DataSource: "+ dataSource.toString());
    }
}
