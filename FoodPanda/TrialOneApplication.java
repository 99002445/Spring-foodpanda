package com.lts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.autowiring.FoodPanda;
import com.lts.autowiring.ShapeFactory;

@SpringBootApplication

public class TrialOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TrialOneApplication.class, args);
	}
	@Autowired
	ApplicationContext context;
	FoodPanda panda;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Employee employee=context.getBean("employee",Employee.class);
		//System.out.println(employee);
		//Student student=context.getBean("student",Student.class);
		//System.out.println(student);
		ShapeFactory shapeFactory=context.getBean("shapeFactory",ShapeFactory.class);
		shapeFactory.printArea(20, 10);
		
		
		FoodPanda fp=context.getBean(FoodPanda.class);
		System.out.println(fp.showMenu("Indian"));
		
	}

}
