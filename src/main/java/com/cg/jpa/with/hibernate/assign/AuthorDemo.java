package com.cg.jpa.with.hibernate.assign;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.jpa.with.hibernate.assign.entities.Author;


public interface AuthorDemo {
public static void main(String[] args) {
		
		System.out.println("Start");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("abcd");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
	
		Author aut1 = new Author(101,"Sitaram","amrut","adarkar",70027727213l);
		Author emp2 = new Author(102,"aniket","ram","sharma",9969770081l);
		Author emp3 = new Author(103,"nilesh","sham","gupta",9969507803l);
		
		// Inserting record  ---> After insertion we cannot again insert that record
//		em.persist(aut1);  //insert
		System.out.println(aut1.toString());
		em.persist(emp2);
//		em.persist(emp3);
		
//		em.remove(emp2);
		
		// Updating record
//		emp1.setFirstName("rakesh");
//		em.merge(emp1);    //Update
		
		// Displaying record
		Author aut = em.find(Author.class, 102);   //Select
		System.out.println(aut.toString());
		
		tr.commit();
		System.out.println("End");
}
}
