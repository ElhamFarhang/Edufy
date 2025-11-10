package com.example.podcastms.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pods")
public class PodController {

    @GetMapping("/list")
    public String listPods() {
        return "List of pods";
    }

    @GetMapping("/listseason")
    public String listPodsSeason() {
        return "List of listPodsSeason";
    }
}
