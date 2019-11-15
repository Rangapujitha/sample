package com.puji.jdbcexample.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements IempDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public Map findEmp(int empno) {
		String s="select * from emp where empno=?";
        Map m = jdbcTemplate.queryForMap(s,empno);
        return m;
	}

}
