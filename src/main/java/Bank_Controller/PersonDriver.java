package Bank_Controller;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Bank.Pan;
import Bank.Person;
import net.bytebuddy.asm.Advice.Local;

public class PersonDriver {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pankaj");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person p=new Person();
		p.setName("Pankaj");
		p.setGender("male");
		p.setPhone(965845);
		
		Pan pan=new Pan();
		pan.setPanNumber("BEWh586");
		pan.setCountry("India");
		pan.setDate(LocalDateTime.now());
		pan.setPerson(p);
		
		et.begin();
		em.persist(p);
		em.persist(pan);
	    et.commit();
		
		
	
	}

}
