package com.springJDBC.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC.entities.Student;

public class StudentDaoImpl implements StudentDao
{
    private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		String query="insert into student(id,name,city)values(?,?,?)";
		int ans = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return ans;
	}

	
}
