package Hibernate_1task.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Hibernate_1task.dto.Employee;

public class Employee_Delete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ganesh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee=entityManager.find(Employee.class, 2);
		
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
		System.out.println(employee);
		
	}

}
