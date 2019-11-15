package com.puji.jdbcexample.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.puji.jdbcexample.config.Appconfig;
import com.puji.jdbcexample.dao.EmpDaoImpl;
import com.puji.jdbcexample.dao.IempDao;

public class Test {
public static void main(String[] args)
{
	ApplicationContext ctx=new  AnnotationConfigApplicationContext(Appconfig.class);
	IempDao ie=(IempDao)ctx.getBean("empDaoImpl");
	System.out.println(ie.findEmp(101));
}
}
