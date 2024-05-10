package com.tis2.services;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.tis2.models.Usuario;
import com.tis2.repositories.UsuarioRepository;

import jakarta.transaction.Transactional;

@Service
public class UsuarioServices {

    @Autowired
    private UsuarioRepository usuarioRepository;



    public Usuario findById(Long id){

        Optional<Usuario> usuario = this.usuarioRepository.findById(id);
        return usuario.orElseThrow(() -> new RuntimeException("Usuário não encontrado! Id: " + id + ", Tipo: " + User.class.getName()));
    }
    @GetMapping
    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }


    @Transactional
    public  Usuario create(Usuario obj) {
        obj.setId(null);
        obj = this.usuarioRepository.save(obj);
        return obj;
    }

    @Transactional
    public Usuario update(Usuario obj){
        Usuario newObj = findById(obj.getId());
        newObj.setDataNascimento(obj.getDataNascimento());
        newObj.setNome(obj.getNome());
        return this.usuarioRepository.save(newObj);
    }

    @Transactional
    public void delete (Long id){
        findById(id);
        try {
            this.usuarioRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Não é possível deletar pois o usuário ainda possui pendências");
        }
    }
}
