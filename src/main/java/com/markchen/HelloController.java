package com.markchen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author markchen
 * @version 1.0
 * @date 2023/4/2 17:13
 */
@RestController
public class HelloController {
    @GetMapping("/hi")
    public String hello(){
        return "hello jenkins";
    }
}
