package com.postgresql.postgresqldemo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1, 2, 3, 자동 생성 어노테이션
    private long id;

    private String name;
}
