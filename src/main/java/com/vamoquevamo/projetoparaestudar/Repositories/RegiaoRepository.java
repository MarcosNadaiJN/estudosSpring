package com.vamoquevamo.projetoparaestudar.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vamoquevamo.projetoparaestudar.Entities.Regiao;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Long>{

}
