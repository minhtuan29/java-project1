package com.example.phanquyen.repository.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Role {
    @Id
    @GeneratedValue
    Integer id;
    String name;
}
