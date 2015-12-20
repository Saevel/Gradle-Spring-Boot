package prv.zielony.gradle.spring.boot.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zielony on 20.12.15.
 */
@RestController
public class MainController {

    @RequestMapping("/echo/{message}")
    public String echo(@PathVariable("message") String message) {
        return message;
    }
}
