package com.vamoquevamo.projetoparaestudar.Resources;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vamoquevamo.projetoparaestudar.Entities.Cidade;
import com.vamoquevamo.projetoparaestudar.Repositories.CidadeRepository;

@RestController
@RequestMapping(value = "/cidades")
public class CidadeResource {

	@Autowired
	private CidadeRepository cidadeRepository;
	
	
	@GetMapping
	public ResponseEntity<List<Cidade>> findAll() {
		List<Cidade> list = cidadeRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Cidade> findById(@PathVariable Long id) {
		Cidade cid = cidadeRepository.findById(id).get();
		return ResponseEntity.ok().body(cid);
	}
	
}
