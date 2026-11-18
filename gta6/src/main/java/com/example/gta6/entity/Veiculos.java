package com.example.gta6.entity;

import jakarta.persistence.*;

@Entity
public class Veiculos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String marca;
    private String imagem;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Veiculos(long id, String nome, String marca, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.imagem = imagem;
        this.descricao = descricao;
    }
    public Veiculos() {}
    public Veiculos( String nome, String marca, String imagem, String descricao) {
        this.nome = nome;
        this.marca = marca;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
