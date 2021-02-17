package com.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hackathon.bean.MarketComments;


@Controller
public class MainController {

    @GetMapping("/refineMarketComments")
    public String sendForm(MarketComments data) {

        return "addMarketComments";
    }

    @PostMapping("/refineMarketComments")
    public String processForm(MarketComments data) {

        return "highlightedMarketComments";
    }
}