package com.example.demo.StudentsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 100, unique = true)
	@NotNull(message = "Must not be null")
	@NotEmpty(message = "Must not be empty")
	@NotBlank(message = "Must not be blank")
	private String name;
	
	@Column(length = 20)
	private String marks;

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

}
