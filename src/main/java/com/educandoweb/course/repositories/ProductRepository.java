package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;

//É passado <Category (obj),Long (id)>
//"Ultima camada" que recebe alguma funcao do service

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
