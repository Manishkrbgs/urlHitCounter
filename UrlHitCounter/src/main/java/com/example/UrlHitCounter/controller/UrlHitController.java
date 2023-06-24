package com.example.UrlHitCounter.controller;

import com.example.UrlHitCounter.service.UrlHitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class UrlHitController {
    private final UrlHitService urlHitService;

    public UrlHitController(UrlHitService urlHitService) {
        this.urlHitService = urlHitService;
    }

    @GetMapping("count")
    public int getHitCount() {
        return urlHitService.incrementHitCount();
    }

    @GetMapping("username/{username}/count")
    public String getUserHitCount(@PathVariable String username) {
        Integer temp = urlHitService.getUserHitCounter(username);

        String s = username+" " + "HitCount"+":"+ temp;
        return "{Username"+":"+s+"}" ;
    }
}


