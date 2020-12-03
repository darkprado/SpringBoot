package com.demo.docker.demoDocker.dao;

import com.demo.docker.demoDocker.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends CrudRepository<Person, Long> {
}