package com.java.training.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.java.training.jpa.entity.Actor;
import com.java.training.jpa.entity.Movie;
import com.java.training.jpa.util.JPAUtil;

public class ManyToManyUniDirectionalMappingMovie {

	public static void main(String[] args) {
		
		// LazyInitilaization  fetchType - EGER, LAZY
		
		
		
		
		createMovieAndActors();
	}

	private static void createMovieAndActors() {

		Actor ntr = new Actor();
		ntr.setId(1);
		ntr.setActorName("NTR");

		Actor pk = new Actor();
		pk.setId(2);
		pk.setActorName("PK");

		List<Movie> ntrMovies = new ArrayList<Movie>();

		Movie movie = new Movie();
		movie.setId(1);
		movie.setMovieName("RRR");

		Movie movie1 = new Movie();
		movie1.setId(2);
		movie1.setMovieName("Aravinda Sametha");

		ntrMovies.add(movie);
		ntrMovies.add(movie1);

		ntr.setMovies(ntrMovies);

		List<Movie> pkMovies = new ArrayList<Movie>();

		Movie movie3 = new Movie();
		movie3.setId(3);
		movie3.setMovieName("Bheemla");

		Movie movie4 = new Movie();
		movie4.setId(4);
		movie4.setMovieName("Vakeel Shaheb");

		pkMovies.add(movie3);
		pkMovies.add(movie4);

		pk.setMovies(pkMovies);

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(ntr);
		em.persist(pk);

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();
	}

}
