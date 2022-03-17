package com.java.training.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.java.training.jpa.entity.Artist;
import com.java.training.jpa.entity.Cinema;
import com.java.training.jpa.util.JPAUtil;

public class ManyToManyBiDirectionalCinema {

	public static void main(String[] args) {
		createMovieAndActors();
	}

	private static void createMovieAndActors() {

		Artist ntr = new Artist();
		ntr.setId(1);
		ntr.setArtistName("NTR");

		Artist pk = new Artist();
		pk.setId(2);
		pk.setArtistName("PK");

		Artist ram = new Artist();
		ram.setId(3);
		ram.setArtistName("Ram Charan");

		Artist gaijibijiBabu = new Artist();
		gaijibijiBabu.setArtistName("Jagapathi");
		gaijibijiBabu.setId(4);

		List<Cinema> ntrMovies = new ArrayList<Cinema>();
		List<Cinema> pkMovies = new ArrayList<Cinema>();
		List<Cinema> ramMovies = new ArrayList<Cinema>();
		List<Cinema> jagapathMovies = new ArrayList<Cinema>();

		
		
		List<Artist> rrrActors = new ArrayList<Artist>();
		rrrActors.add(ntr);
		rrrActors.add(ram);

		List<Artist> arrActors = new ArrayList<Artist>();
		arrActors.add(ntr);
		arrActors.add(gaijibijiBabu);

		Cinema rrr = new Cinema();
		rrr.setId(1);
		rrr.setCinemaName("RRR");
		rrr.setArtists(rrrActors);

		Cinema asr = new Cinema();
		asr.setId(2);
		asr.setCinemaName("Aravinda Sametha");
		asr.setArtists(arrActors);

		ntrMovies.add(rrr);
		ntrMovies.add(asr);

		ntr.setCinemas(ntrMovies);

		Cinema bheemla = new Cinema();
		bheemla.setId(3);
		bheemla.setCinemaName("Bheemla");

		Cinema vs = new Cinema();
		vs.setId(4);
		vs.setCinemaName("Vakeel Shaheb");

		pkMovies.add(bheemla);
		pkMovies.add(vs);

		pk.setCinemas(pkMovies);

		
		ramMovies.add(rrr);
		ram.setCinemas(ramMovies);
		
		jagapathMovies.add(asr);
		gaijibijiBabu.setCinemas(jagapathMovies);
		
		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(ntr);
		em.persist(pk);
		em.persist(ram);
		em.persist(gaijibijiBabu);

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();
	}

}
