package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmacia.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public List<Usuario> findAllByClienteContainingIgnoreCase(@Param("cliente") String cliente);
	
	public List<Usuario> findAllByConvenioContainingIgnoreCase(@Param("convenio") String convenio);
	
	public List<Usuario> findAllByIdade(Integer idade);
}
