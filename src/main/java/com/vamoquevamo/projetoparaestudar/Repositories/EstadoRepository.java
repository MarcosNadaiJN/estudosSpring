package com.vamoquevamo.projetoparaestudar.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vamoquevamo.projetoparaestudar.Entities.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

}
