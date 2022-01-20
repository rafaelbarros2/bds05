package com.devsuperior.movieflix.movieflix.repositories;

import com.devsuperior.movieflix.movieflix.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
