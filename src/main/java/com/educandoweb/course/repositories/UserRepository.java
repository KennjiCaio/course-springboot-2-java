package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

//É passado <User (obj),Long (id)>
//"Ultima camada" que recebe alguma funcao do service

public interface UserRepository extends JpaRepository<User, Long>{
	
}
