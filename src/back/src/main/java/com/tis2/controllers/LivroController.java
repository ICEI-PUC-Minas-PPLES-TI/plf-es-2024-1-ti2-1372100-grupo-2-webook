package com.tis2.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.tis2.models.Livro;
import com.tis2.services.LivroServices;

import jakarta.validation.Valid;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/livro")
@Validated
public class LivroController {

    @Autowired
    private LivroServices livroServices;


    @GetMapping("/{Id}")
    public ResponseEntity<Livro> Id(@PathVariable Long Id){
        Livro obj = this.livroServices.buscarPeloId(Id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Void> create(@Valid @RequestBody Livro obj){
        this.livroServices.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{Id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping ("/{Id}")
    public ResponseEntity<Void> update(@Valid @RequestBody Livro obj, @PathVariable Long Id){
        obj.setId(Id);  
        this.livroServices.update(obj);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{Id}")
    public ResponseEntity<Void> delete(@PathVariable Long Id){
        this.livroServices.delete(Id);
        return ResponseEntity.noContent().build();
    }
    
}
