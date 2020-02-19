package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.StudentsEntity.Students;



@CrossOrigin
@RepositoryRestResource(itemResourceRel = "student", collectionResourceRel = "students", path = "student")
public interface StudentRepository extends CrudRepository<Students, Long> {
	
	//@Query("select u.Id as Id from Students u where u.userId=?1")
	Optional<String> findByName(String name);
}