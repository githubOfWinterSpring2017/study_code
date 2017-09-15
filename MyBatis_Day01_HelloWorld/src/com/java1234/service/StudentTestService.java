package com.java1234.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.java1234.mappers.StudentMapper;
import com.java1234.model.Student;
import com.java1234.util.SqlSessionFactoryUtil;

public class StudentTestService {

	private static Logger logger  = Logger.getLogger(StudentTestService.class);
	
	
	public static void main(String[] args) {
		
		
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

	//	addStudent(studentMapper);
	//	updateStudent(studentMapper);
	//	deleteStudent(studentMapper);
		
		searchStudent(studentMapper);
		
		sqlSession.commit();
		logger.info("查询成功");
		logger.debug("查询成功");
		logger.error("查询成功");
		
	}

	public static void addStudent(StudentMapper studentMapper) {
		Student student = new Student("小名", 10);
		int result = studentMapper.add(student);
		if (result > 0) {
			System.out.println("添加数据成功!");
		}
	}

	public static void updateStudent(StudentMapper studentMapper) {
		Student student = new Student("小红", 10);
		int result = studentMapper.update(student);
		if (result > 0) {
			System.out.println("更新数据成功");
		}
	}

	public static void searchStudent(StudentMapper studentMapper) {
		Student student = studentMapper.search("小黄");
		if (null != student)
			System.out.println(student);
	}
	
	public static void deleteStudent(StudentMapper studentMapper){
		Student student = new Student("小红",10);
		int result = studentMapper.delete(student);
		if(result > 0){
			System.out.println("删除数据成功");
		}
	}

}
