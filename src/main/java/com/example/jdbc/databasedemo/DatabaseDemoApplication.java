package com.example.jdbc.databasedemo;

import com.example.jdbc.databasedemo.entity.person;
import com.example.jdbc.databasedemo.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	public PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("all the people in the list are ->{}", dao.findAllPersons());
		logger.info("person with id 1001 id is -> {}", dao.findById(1002));
		logger.info("Number of persons removed -> {}", dao.deleteById(1002));
		logger.info("person update by id ->{}",dao.updatePerson(new person(1003,
				"Virat", "happy days", new Date())));
		logger.info("Insert person -> {}", dao.insertPerson(new person(1005,
				"Happy days", "happy people", new Date())));
	}
}
