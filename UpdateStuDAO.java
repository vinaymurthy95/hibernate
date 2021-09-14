package com.assign.hibern;

import java.util.List;

import javax.persistence.*;

public class UpdateStuDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("stu");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		// String hql= "update StudentCreateDTO s set s.percentage =: percentage+10%
		// where s.name=:name";
		Query query = manager.createQuery("update StudentDTO  set percentage = percentage+10");
		int rows = query.executeUpdate();
		System.out.println("No. of rows affected " + rows);
		transaction.commit();

	}

}
