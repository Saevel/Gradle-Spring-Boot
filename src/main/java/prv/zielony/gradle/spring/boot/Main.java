package prv.zielony.gradle.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import prv.zielony.gradle.spring.boot.configuration.ApplicationContext;

/**
 * Created by zielony on 20.12.15.
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(ApplicationContext.class, args);
    }
}
