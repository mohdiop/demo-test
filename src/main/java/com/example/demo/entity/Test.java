package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "test_table")
public class Test {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String description;
}
