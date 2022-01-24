package com.vamoquevamo.projetoparaestudar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vamoquevamo.projetoparaestudar.Entities.Cidade;
import com.vamoquevamo.projetoparaestudar.Entities.Estado;
import com.vamoquevamo.projetoparaestudar.Entities.Regiao;
import com.vamoquevamo.projetoparaestudar.Repositories.CidadeRepository;
import com.vamoquevamo.projetoparaestudar.Repositories.EstadoRepository;
import com.vamoquevamo.projetoparaestudar.Repositories.RegiaoRepository;

@SpringBootApplication
public class ProjetoparaestudarApplication implements CommandLineRunner{
	
	@Autowired
	private RegiaoRepository regiaoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(ProjetoparaestudarApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		
		Regiao reg1 = new Regiao(null, "sul");
		regiaoRepository.save(reg1);
		
		Estado est1 = new Estado(null, "parana", reg1);
		estadoRepository.save(est1);
		
		Cidade cid1 = new Cidade(null, "nova esperanca", est1);
		cidadeRepository.save(cid1);
		
		Regiao reg2 = new Regiao(null, "sudeste");
		regiaoRepository.save(reg2);
		
		Estado est2 = new Estado(null, "são paulo", reg1);
		estadoRepository.save(est2);
		
		Cidade cid2 = new Cidade(null, "sampa city", est1);
		cidadeRepository.save(cid2);
		
		Regiao reg3 = new Regiao(null, "nordeste");
		regiaoRepository.save(reg3);
		
		Estado est3 = new Estado(null, "bahia", reg1);
		estadoRepository.save(est3);
		
		Cidade cid3 = new Cidade(null, "salvador", est1);
		cidadeRepository.save(cid3);
		
	}

}
