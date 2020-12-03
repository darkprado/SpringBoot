package com.demo.docker.demoDocker.service;

import com.demo.docker.demoDocker.dao.PersonDao;
import com.demo.docker.demoDocker.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {

    public final PersonDao personDao;

    public List<Person> findAll() {
        return (List<Person>) personDao.findAll();
    }

    public Person save(Person person) {
        return personDao.save(person);
    }

    public long getPersonCount() {
        return personDao.count();
    }
}
