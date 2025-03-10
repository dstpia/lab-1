package com.ragnarock.musicrecommends.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebsiteController {
    private static final String TITLE = "title";

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute(TITLE, "Главная страница");
        return "home";
    }

    @GetMapping("/About")
    public String about(Model model) {
        model.addAttribute(TITLE, "О нас");
        return "about";
    }

    @GetMapping("/Genres")
    public String genres(Model model) {
        model.addAttribute(TITLE, "Жанры");
        return "genres";
    }

    @GetMapping("/Authors")
    public String authors(Model model) {
        model.addAttribute(TITLE, "Авторы");
        return "authors";
    }

    @GetMapping("/Years")
    public String years(Model model) {
        model.addAttribute(TITLE, "Года");
        return "years";
    }
}