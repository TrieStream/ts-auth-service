package com.triestream.tsauthservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zoo")
public class Controller {

    @GetMapping
    private String ZooGet() {
        return "Zoo GET req";
    }
}
