package com.postgresql.postgresqldemo;

import com.postgresql.postgresqldemo.model.Person;
import com.postgresql.postgresqldemo.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonRepo repo;

    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person) {
        repo.save(person);
        System.out.println("!1");
    }

    @DeleteMapping("/deletePerson")
    public void deletePerson(long id) {
        repo.deleteById(id);
    }
}
