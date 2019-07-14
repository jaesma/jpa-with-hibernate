package com.manalangjames;

import com.manalangjames.entity.Course;
import com.manalangjames.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaWithHibernateApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CourseRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(JpaWithHibernateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Course course = repository.findById(10001L);
        logger.info("{}", course);
    }
}
