package com.devsuperior.movieflix.movieflix.resources;

import java.util.List;

import com.devsuperior.movieflix.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.movieflix.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/reviews")
public class ReviewResource {
	
	@Autowired
	private ReviewService service;
	
	@GetMapping
	public ResponseEntity<List<ReviewDTO>> findAll(){
		List<ReviewDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
