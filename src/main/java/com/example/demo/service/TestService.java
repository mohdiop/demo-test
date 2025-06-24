package com.example.demo.service;

import com.example.demo.repository.TestRepository;
import com.example.demo.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public String ajouterTest(Test test){
        testRepository.save(test);
        return "Test ajouté avec succès!";
    }

    public Test modifierTest(Test test){
        return testRepository.save(test);
    }

    public String supprimerTest(int id){
        testRepository.deleteById(id);
        return "Test supprimé avec succès!";
    }

    public List<Test> afficherTests(){
        return testRepository.findAll();
    }

    public Test rechercherParId(int id){
        Optional<Test> optionalTest = testRepository.findById(id);
        if(optionalTest.isPresent()){
            return optionalTest.get();
        }
        return null;
    }

    public Test rechercherParDescription(String description){
        return testRepository.findByDescription(description);
    }

    public Test rechercherParIdEtDescription(int id, String description){
        return testRepository.findByIdAndDescription(id, description);
    }
}
