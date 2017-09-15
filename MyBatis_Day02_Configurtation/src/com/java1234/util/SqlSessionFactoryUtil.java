package com.java1234.util;

import java.io.InputStream;
import java.sql.Connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.TransactionIsolationLevel;


public class SqlSessionFactoryUtil {

	private static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSessionFactory getSqlSessionFactory(){
		if(null == sqlSessionFactory){
			InputStream inputStream = null;
			try{
				inputStream = Resources.getResourceAsStream("mybatis-config2.xml");
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return sqlSessionFactory;
	}
	
	public static SqlSession openSession(){
		return sqlSessionFactory.openSession();
	}
	
}
