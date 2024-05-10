package com.tis2.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.tis2.models.Usuario;
import com.tis2.models.Usuario.CriarUsuario;
import com.tis2.services.UsuarioServices;

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
@RequestMapping("/usuario")
@Validated
public class UsuarioController {

    @Autowired
    private UsuarioServices usuarioServices;

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id){
        Usuario obj = this.usuarioServices.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    @Validated(CriarUsuario.class)
    public ResponseEntity<Void> create(@Valid @RequestBody Usuario obj){
        this.usuarioServices.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@Valid @RequestBody Usuario obj, @PathVariable Long id){
        obj.setId(id);
        this.usuarioServices.update(obj);
        return ResponseEntity.noContent().build();
    }  

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.usuarioServices.delete(id);
        return ResponseEntity.noContent().build();

    }

}
