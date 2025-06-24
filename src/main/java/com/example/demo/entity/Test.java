package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "test_table")
public class Test {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String description;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }
}
