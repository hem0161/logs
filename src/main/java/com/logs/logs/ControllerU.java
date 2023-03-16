package com.logs.logs;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerU {
    private final UserService uServ;


    @Autowired
    public ControllerU(UserService uServ) {
        this.uServ = uServ;
    }

    @GetMapping("/new")
    public String hello(Person person) {
        return "person";
    }

    @PostMapping ("/person")
    public String addUser (@Valid Person person, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors())
        {
            return "person";
        }
        uServ.save(person);
        model.addAttribute("person", uServ.findAll());
        return "result";

    }


}