package com.vamoquevamo.projetoparaestudar.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vamoquevamo.projetoparaestudar.Entities.Regiao;
import com.vamoquevamo.projetoparaestudar.Repositories.RegiaoRepository;


@RestController
@RequestMapping(value = "/regioes")
public class RegiaoResource {
	
	@Autowired
	private RegiaoRepository regiaoRepository;
	
	@GetMapping
	public ResponseEntity<List<Regiao>> findAll(){
		List<Regiao> list = regiaoRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Regiao> findById(@PathVariable Long id) {
		Regiao reg = regiaoRepository.findById(id).get();
		return ResponseEntity.ok().body(reg);
	}
	
}
