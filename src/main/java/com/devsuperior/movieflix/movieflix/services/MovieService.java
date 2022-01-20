package com.devsuperior.movieflix.movieflix.services;

import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.movieflix.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.movieflix.entities.Movie;
import com.devsuperior.movieflix.movieflix.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repository;
	
	@Transactional(readOnly = true)
	public List<MovieDTO> findAll(){
		List<Movie> list = repository.findAll();
		return list.stream().map(x -> new MovieDTO(x)).collect(Collectors.toList());
	}

}
