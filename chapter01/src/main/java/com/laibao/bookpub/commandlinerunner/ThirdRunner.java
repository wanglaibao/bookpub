package com.laibao.bookpub.commandlinerunner;

import com.laibao.bookpub.repository.BookRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;

import javax.sql.DataSource;

public class ThirdRunner implements CommandLineRunner{
    private final Log logger = LogFactory.getLog(ThirdRunner.class);

//    @Autowired
//    @Qualifier("dataSource")            //为什么必须要这样呢？ 不这样的话 有一个奇怪的问题
//    private DataSource dataSource;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("I am the third CommandLineRunner java class");
        //logger.info("DataSource: "+ dataSource.toString());
        logger.info("Number of books: " + bookRepository.count());
    }


    @Scheduled(initialDelay = 1000, fixedRate = 10000)
    public void run() {
        logger.info("Number of books: " + bookRepository.count());
    }
}
