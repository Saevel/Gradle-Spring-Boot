package prv.zielony.gradle.spring.boot.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@EnableAutoConfiguration
@ComponentScan("prv.zielony.gradle.spring.boot.controllers")
public class ApplicationContext {
    ;
}
