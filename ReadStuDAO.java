package com.assign.hibern;

import java.util.List;
import javax.persistence.*;

public class ReadStuDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("stu");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("from StudentDTO");

		List<StudentDTO> lisdtos = query.getResultList();
		for (StudentDTO sdto : lisdtos) {
			System.out.println(sdto.getId() + " " + sdto.getName() + " " + sdto.getStream() + " " + sdto.getPercentage()
					+ " " + sdto.getPhone() + " " + sdto.getAge());
		}

	}

}
