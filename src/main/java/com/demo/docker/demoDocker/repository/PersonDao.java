package com.demo.docker.demoDocker.repository;

import com.demo.docker.demoDocker.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends CrudRepository<Person, Long> {

    Person findByName(String name);

}
