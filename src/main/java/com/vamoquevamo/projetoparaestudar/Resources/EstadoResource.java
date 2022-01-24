package com.vamoquevamo.projetoparaestudar.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vamoquevamo.projetoparaestudar.Entities.Estado;
import com.vamoquevamo.projetoparaestudar.Entities.Regiao;
import com.vamoquevamo.projetoparaestudar.Repositories.EstadoRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@GetMapping
	public ResponseEntity<List<Estado>> findAll(){
		List<Estado> list = estadoRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Estado> findById(@PathVariable Long id) {
		Estado est = estadoRepository.findById(id).get();
		return ResponseEntity.ok().body(est);
	}

}
