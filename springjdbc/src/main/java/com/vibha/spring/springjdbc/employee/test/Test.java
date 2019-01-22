package com.vibha.spring.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vibha.spring.springjdbc.employee.dao.EmployeeDao;
import com.vibha.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx =  new ClassPathXmlApplicationContext("com/vibha/spring/springjdbc/employee/test/config.xml");
		EmployeeDao obj = (EmployeeDao) ctx.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setId(3);
		employee.setFirstName("Archie");
		employee.setLastName("Andrews");
		int result=obj.create(employee);
		System.out.println("Number of rows added: "+result);
	}

}
