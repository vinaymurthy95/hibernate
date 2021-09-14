package com.assign.hibern;

import javax.persistence.*;

public class DeleteStuDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("stu");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createQuery("delete from StudentDTO  where  percentage<50");
		int rows = query.executeUpdate();
		System.out.println("No. of rows affected " + rows);
		transaction.commit();

	}

}
