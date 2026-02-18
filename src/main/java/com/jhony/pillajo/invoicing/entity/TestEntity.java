package com.jhony.pillajo.invoicing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TestEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
