package com.tis2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tis2.models.Livro;


@Repository
public interface LivroRepository extends JpaRepository <Livro, Long> {
   
    
}
