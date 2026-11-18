package com.example.gta6.service;

import com.example.gta6.entity.Arma;
import com.example.gta6.repository.Armarepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmaService {

    private final Armarepository armarepository;

    public ArmaService(Armarepository armarepository) {
        this.armarepository = armarepository;
    }

    public void criarArma(Arma arma) {
        armarepository.save(arma);
    }

    public List<Arma> acharArma() {
        return armarepository.findAll();
    }
    public void excluirArma(long id) {
        armarepository.deleteById(id);
    }
    public void editarArma(long id,Arma arma) {
        Arma armaAtualizado = armarepository.findById(id).get();
        armaAtualizado.setDescricao(arma.getDescricao());
        armaAtualizado.setCategoria(arma.getCategoria());
        armaAtualizado.setFabricante(arma.getFabricante());
        armaAtualizado.setNome(arma.getNome());
        armaAtualizado.setImagem(arma.getImagem());

    }
}
