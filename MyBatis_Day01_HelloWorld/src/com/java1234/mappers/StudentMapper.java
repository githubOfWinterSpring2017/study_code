package com.java1234.mappers;

import com.java1234.model.Student;

public interface StudentMapper {


	public int add(Student student);
	public int update(Student student);
	public int delete(Student student);
	public Student search(String name);
}
