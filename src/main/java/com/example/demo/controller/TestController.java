package com.example.demo.controller;

import com.example.demo.entity.Test;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tests")
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping
    public String ajouterTest(
            @RequestBody Test test
    ) {
        return testService.ajouterTest(test);
    }

    @GetMapping("/all")
    public List<Test> tousLesTests(){
        return testService.afficherTests();
    }

    @GetMapping("/{id}")
    public Test rechercherTestParId(
            @PathVariable int id
    ) {
        return testService.rechercherParId(id);
    }

    @GetMapping("/id-description")
    public Test rechercherParIdEtDescription(
            @RequestParam int id,
            @RequestParam String description
    ) {
        return testService.rechercherParIdEtDescription(id, description);
    }
}
