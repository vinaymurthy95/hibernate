package com.assign.hibern;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CreateStuDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("stu");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		StudentDTO sdto = new StudentDTO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student name:");
		String name = scanner.nextLine();

		System.out.println("Enter student stream:");
		String stream = scanner.nextLine();

		System.out.println("Enter student Percentage:");
		Double per = scanner.nextDouble();

		System.out.println("Enter student Phone:");
		Integer phone = scanner.nextInt();

		System.out.println("Enter student Age:");
		Integer age = scanner.nextInt();

		System.out.println("Enter student Address:");
		String addr = scanner.next();

		sdto.setName(name);
		sdto.setStream(stream);
		sdto.setPercentage(per);
		sdto.setPhone(phone);
		sdto.setAge(age);
		sdto.setAddress(addr);

		manager.persist(sdto);

		transaction.commit();
		manager.close();
		factory.close();

	}

}
