package Bank_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Bank.Address;
import Bank.Branch;

public class BankDriver {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pankaj");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	
		
		Branch b=new Branch();
		b.setName("bhosari");
		b.setPhone(9564812);
		
		
		
		Address a=new Address();
		a.setArea("Bhosari");
		a.setPin(411039);
		a.setState("Maharashtra");
		
		b.setAddress(a);
		
		et.begin();
		em.persist(b);
		em.persist(a);
		et.commit();
		
	}

}
