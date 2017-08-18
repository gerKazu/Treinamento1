package com.indracompany.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.indracompany.model.Cliente;



public interface ClienteRepository extends CrudRepository<Cliente,Long>{
}
