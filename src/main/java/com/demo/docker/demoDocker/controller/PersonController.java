package com.demo.docker.demoDocker.controller;

import com.demo.docker.demoDocker.model.Person;
import com.demo.docker.demoDocker.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    @GetMapping(value = "/show/all")
    public ResponseEntity<List<Person>> addPerson() {
        return ResponseEntity.ok(personService.findAll());
    }

    @GetMapping(value = "/add/{name}/{age}", produces = {"application/json"})
    public ResponseEntity<Person> addPerson(
            @PathVariable("name") String name,
            @PathVariable("age") Integer age
    ) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return ResponseEntity.ok(personService.save(person));
    }

    @GetMapping(value = "/show/count", produces = {"application/json"})
    public ResponseEntity<Long> getPersonCount() {
        return ResponseEntity.ok(personService.getPersonCount());
    }

}
