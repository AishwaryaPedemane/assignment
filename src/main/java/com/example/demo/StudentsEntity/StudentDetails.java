package com.example.demo.StudentsEntity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "StudentInfoProjection", types = Students.class)
public interface StudentDetails {

	String getId();

	String getName();

}
