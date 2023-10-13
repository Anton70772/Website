package com.cinema.cinemaSecarch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "/index/landing";
    }

    @GetMapping("/catalog")
    public String catalog(Model model) {
        model.addAttribute("title", "Каталог фильмов");
        return "/catalog/catalog";
    }
}
