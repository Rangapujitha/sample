package com.puji.jdbcexample.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.puji.jdbcexample.dao.EmpDaoImpl;

@Configuration
@ComponentScan(basePackages="com.puji.jdbcexample")
public class Appconfig {
	@Bean
	public DataSource datasource()
	{
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setDriverClassName("org.h2.Driver");
	    datasource.setUrl("jdbc:h2:tcp://localhost/~/test");
	      datasource.setUsername("sa");
	    datasource.setPassword("");
	    return datasource;

	}
	@Bean
	public JdbcTemplate jdbcTemplate()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource((DataSource) datasource());
        return jdbcTemplate;
	}

}
