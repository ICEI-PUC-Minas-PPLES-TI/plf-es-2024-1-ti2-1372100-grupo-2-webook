package com.tis2.models;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
    private BigDecimal preco;

    @Column(name = "disponivel", nullable = false)
    private boolean disponivel;

    @ManyToMany(mappedBy = "livros")
    @JsonIgnore
    private List<Emprestimo> emprestimos;


    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
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

    public BigDecimal getPreco() {
        return this.preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public boolean getDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public List<Emprestimo> getEmprestimos() {
        return this.emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    
}
