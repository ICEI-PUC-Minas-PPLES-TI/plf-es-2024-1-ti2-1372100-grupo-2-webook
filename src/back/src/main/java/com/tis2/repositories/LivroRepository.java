package com.tis2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tis2.models.Livro;


@Repository
public interface LivroRepository extends JpaRepository <Livro, Long> {

   
    List<Livro> findByUsuario_Id(Long id);

}
