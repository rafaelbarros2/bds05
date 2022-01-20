package com.devsuperior.movieflix.movieflix.resources;

import java.util.List;

import com.devsuperior.movieflix.movieflix.dto.RoleDTO;
import com.devsuperior.movieflix.movieflix.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/roles")
public class RoleResource {

	@Autowired
	private RoleService service;
	
	@GetMapping
	public ResponseEntity<List<RoleDTO>> findAll(){
		List<RoleDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
