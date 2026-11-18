package com.example.gta6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Arma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String fabricante;
    private String imagem ;
    private String descricao;
    @Enumerated(EnumType.STRING)
    CategoriaArma categoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String url) {
        this.imagem = url;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CategoriaArma getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaArma categoria) {
        this.categoria = categoria;
    }

    public Arma(Long id, String nome, String fabricante, String imagem, String descricao, CategoriaArma categoria) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.imagem = imagem;
        this.descricao = descricao;
        this.categoria = categoria;
    }
    public Arma(){}
    public Arma( String nome, String fabricante, String imagem, String descricao, CategoriaArma categoria) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.imagem = imagem;
        this.descricao = descricao;
        this.categoria = categoria;
    }


}
