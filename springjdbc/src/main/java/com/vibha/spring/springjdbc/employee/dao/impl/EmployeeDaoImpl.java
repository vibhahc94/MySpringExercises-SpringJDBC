package com.vibha.spring.springjdbc.employee.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.vibha.spring.springjdbc.employee.dao.EmployeeDao;
import com.vibha.spring.springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());

		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstName=?,lastName=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());

		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql,id);
		return result;
	}

}
