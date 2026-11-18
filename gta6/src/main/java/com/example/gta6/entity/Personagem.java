package com.example.gta6.entity;

import jakarta.persistence.*;

@Entity
public class Personagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nome;
    String apelido;
    String imagem;
    String descricao;
    @Enumerated(EnumType.STRING)
    Categoria categoria;

    public Personagem() {
    }

    public Personagem(long id, String nome, String apelido, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Personagem(long id, String apelido, String imagem, String descricao) {
        this.id = id;
        this.apelido = apelido;
        this.imagem = imagem;
        this.descricao = descricao;
    }

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

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
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
}
