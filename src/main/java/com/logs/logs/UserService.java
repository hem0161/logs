package com.logs.logs;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserService extends CrudRepository<Person, Long> {

}

