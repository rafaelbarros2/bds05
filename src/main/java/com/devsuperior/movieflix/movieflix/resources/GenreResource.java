package com.devsuperior.movieflix.movieflix.resources;

import java.util.List;

import com.devsuperior.movieflix.movieflix.dto.GenreDTO;
import com.devsuperior.movieflix.movieflix.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/genres")
public class GenreResource {
	
	@Autowired
	private GenreService service;
	
	@GetMapping
	public ResponseEntity<List<GenreDTO>> findAll(){
		List<GenreDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
