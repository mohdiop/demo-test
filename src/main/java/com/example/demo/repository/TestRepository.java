package com.example.demo.repository;

import com.example.demo.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Integer> {
    Test findByDescription(String description);
    Test findByIdAndDescription(int id, String description);
}
