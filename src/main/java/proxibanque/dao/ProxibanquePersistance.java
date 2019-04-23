package proxibanque.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import proxibanque.utilisation.Client;
import proxibanque.utilisation.Compte;
import proxibanque.utilisation.Conseiller;

public class ProxibanquePersistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		
		try {
			txn.begin();
			
			Compte c1 =new Compte();
			Client c = new Client();
			Conseiller C = new Conseiller();
			c.setName("bla");
			c1.setNcompte("120");
			C.setName("blabla");
			
			c.setConseiller(C);
			c1.setClient(c);
			
			Set<Compte> tabc = new HashSet<Compte>();
			Set<Client> tabcl = new HashSet<Client>();
			tabc.add(c1);
			tabcl.add(c);
		
			c.setListecompte(tabc);
			C.setListeclient(tabcl);
			
			
			
			
			em.persist(c1);
			em.persist(c);
			em.persist(C);
			
			txn.commit();
			
		} 
		
		catch (Exception e) {
			if (txn!=null) {
			txn.rollback();
			}
			e.printStackTrace();
			
		} 
		
		finally {
			if (em != null) {
				em.close();
			}
			if (emf !=null) {
				emf.close();
				
			}
			
		}

		
	}

}
