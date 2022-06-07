package com.revature.project1;

import com.revature.project1.model.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Project1Application {
	@Autowired
	Item item1;

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}

}
