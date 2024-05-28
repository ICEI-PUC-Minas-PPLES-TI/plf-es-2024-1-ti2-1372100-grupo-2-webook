package com.tis2.models;


import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;





@Entity
@Table(name = Livro.TABLE_NAME)
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
    public interface CriarLivro {}
    public interface AtualizarLivro {}

    public static final String TABLE_NAME = "livro";


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  Id;

    @ManyToOne
    @JoinColumn(name ="usuario_id", nullable = true, updatable = true)
    @JsonBackReference
    private Usuario usuario;

    @Column(name = "ISBN", unique = true, nullable = false)
    @NotBlank(groups = {CriarLivro.class, AtualizarLivro.class})
    private Long  ISBN;

    @Column(name = "tituloLivro", nullable = false)
    @NotBlank(groups = {CriarLivro.class, AtualizarLivro.class})
    private String tituloLivro;

    @NotBlank(groups = {CriarLivro.class, AtualizarLivro.class})
    @Column(name = "secao", nullable = false)
    private String secao;

    @NotBlank(groups = {CriarLivro.class, AtualizarLivro.class})
    @Column(name = "autor", nullable = false)
    private String autor;

    @NotBlank(groups = {CriarLivro.class, AtualizarLivro.class})
    @Column(name = "editora", nullable = false)
    private String editora;

    @NotBlank(groups = {CriarLivro.class, AtualizarLivro.class})
    @Column(name = "preco", nullable = false)
    private float preco;

    @NotBlank(groups = {CriarLivro.class, AtualizarLivro.class})
    @Column(name = "dataEmprestimo", nullable = true)
    private LocalDate dataEmprestimo;

    @NotBlank(groups = {CriarLivro.class, AtualizarLivro.class})
    @Column(name = "diasEmprestado", nullable = true)
    private int diasEmprestado;


    public int getDiasEmprestado() {
        return this.diasEmprestado;
    }

    public void setDiasEmprestado(int diasEmprestado) {
        this.diasEmprestado = diasEmprestado;
    }

    public LocalDate getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }
    

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getISBN() {
        return this.ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTituloLivro() {
        return this.tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getSecao() {
        return this.secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
