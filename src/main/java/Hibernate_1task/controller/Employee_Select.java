package Hibernate_1task.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Hibernate_1task.dto.Employee;

public class Employee_Select {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ganesh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Employee employee=entityManager.find(Employee.class, 2);
		System.out.println(employee);
		
		
	}
}
