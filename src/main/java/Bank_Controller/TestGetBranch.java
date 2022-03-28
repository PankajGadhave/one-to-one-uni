package Bank_Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Bank.Address;
import Bank.Branch;

public class TestGetBranch {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pankaj");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Branch branch=em.find(Branch.class, 0);
		Address address=branch.getAddress();
		
		System.out.println("Branch name:"+branch.getName());
		System.out.println("Branch phone:"+branch.getPhone());
		System.out.println("Branch Addre");
		System.out.println("Area:"+address.getArea());
		System.out.println("Area:"+address.getPin());
		System.out.println("State:"+address.getState());
	}
}
