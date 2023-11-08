package com.senai.TrbLivros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.TrbLivros.entities.Livro;



public interface LivroRepository extends JpaRepository<Livro, Long>{

}
