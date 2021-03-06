package com.morozov.spring.controllers;

import com.morozov.spring.model.Parents;
import com.morozov.spring.repositories.ParentsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class DatabaseController {
    private final ParentsRepository parentsRepository;

    @GetMapping("/database")
    public String main(Model model) {
        List<Parents> parents = (List<Parents>) parentsRepository.findAll();
        model.addAttribute("parents", parents);
        return "database";
    }
}
