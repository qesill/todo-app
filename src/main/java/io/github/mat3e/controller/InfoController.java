package io.github.mat3e.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class InfoController {
    @Autowired
    private DataSourceProperties dataSource;
    @Value("${my.prop}")
    private String myProp;
    @GetMapping("/info/url")
    String url() {
        return url;
    }
    @GetMapping("/info/prop")
    String myProp() {
        return myProp;
    }
}
