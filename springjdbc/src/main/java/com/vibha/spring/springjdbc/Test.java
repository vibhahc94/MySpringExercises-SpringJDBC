package com.vibha.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx =  new ClassPathXmlApplicationContext("com/vibha/spring/springjdbc/config.xml");
		JdbcTemplate obj = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		int result = obj.update(sql, new Integer(1),"Vibha","H C");
		System.out.println("Number of rows added: "+result);
	}

}
