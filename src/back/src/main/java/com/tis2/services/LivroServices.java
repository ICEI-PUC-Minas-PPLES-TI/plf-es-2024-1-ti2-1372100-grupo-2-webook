package com.tis2.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.tis2.models.Livro;
import com.tis2.repositories.LivroRepository;

import jakarta.transaction.Transactional;

import java.util.List;

@Service
public class LivroServices {

    @Autowired
    private LivroRepository livroRepository;



    @GetMapping
    public List<Livro> findAll(){
        return livroRepository.findAll();
    }

    public List<Livro> findAllByUserId (Long userId) {
        List<Livro> livros = this.livroRepository.findByUsuario_Id(userId);
        return livros;
    }

    public Livro buscarPeloId(Long Id){
        Optional<Livro> livro = this.livroRepository.findById(Id);
        
        return livro.orElseThrow(() -> new RuntimeException(
            "Id  não encontrado! Id: " + Id + ", Tipo: " + Livro.class.getName()
        ));
    }

    @SuppressWarnings("null")
    @Transactional
    public Livro create(Livro obj){
        obj.setId((Long) null);
        obj = this.livroRepository.save(obj);
        
        return obj;
    }
    @Transactional
    public Livro update(Livro obj){
        Livro newObj = buscarPeloId(obj.getId());
        newObj.setUsuario(obj.getUsuario());
        newObj.setTituloLivro(obj.getTituloLivro());
        newObj.setAutor(obj.getAutor());
        newObj.setEditora(obj.getEditora());
        newObj.setSecao(obj.getSecao());
        newObj.setPreco(obj.getPreco());
        return this.livroRepository.save(newObj);
    }

    public void delete(Long Id){
        buscarPeloId(Id);
        try {
            this.livroRepository.deleteById(Id);
        } catch (Exception e) {
            throw new RuntimeException("Não é possivel excluir pois há entidades relacionadas");
        }
    }
    
}
