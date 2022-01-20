package com.devsuperior.movieflix.movieflix.resources;

import java.util.List;

import com.devsuperior.movieflix.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.movieflix.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movies")
public class MovieResource {
	
	@Autowired
	private MovieService service;
	
	@GetMapping
	public ResponseEntity<List<MovieDTO>> findAll(){
		List<MovieDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
