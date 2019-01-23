package com.vibha.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vibha.spring.springjdbc.employee.dao.EmployeeDao;
import com.vibha.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/vibha/spring/springjdbc/employee/test/config.xml");
		EmployeeDao obj = (EmployeeDao) ctx.getBean("employeeDao");
		/*Employee employee = new Employee();
		employee.setId(3);
		employee.setFirstName("Fred");
		employee.setLastName("Andrews");*/
		// int result=obj.create(employee);
		//int result = obj.update(employee);
		//int result=obj.delete(3);
		//Employee employee = obj.read(2);
		
		List<Employee> result = obj.read();
		System.out.println("Employee Record: " + result);
	}

}
