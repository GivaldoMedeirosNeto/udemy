package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-JPA");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = new Usuario("Usuario", "usuario@petclini.vet.br");
		
		em.getTransaction().begin();		
		em.persist(usuario);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}

}
