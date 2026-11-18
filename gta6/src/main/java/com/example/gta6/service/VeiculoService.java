package com.example.gta6.service;

import com.example.gta6.entity.Arma;
import com.example.gta6.entity.Categoria;
import com.example.gta6.entity.Veiculos;
import com.example.gta6.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {
    VeiculoRepository veiculoRepository;
    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }
    public void criarVeiculo(Veiculos veiculos) {
        veiculoRepository.save(veiculos);
    }
    public List<Veiculos> acharVeiculos() {
        return veiculoRepository.findAll();
    }
    public void excluirVeiculo(Long id) {
        veiculoRepository.deleteById(id);
    }
    public void editarVeiculo(Long id, Veiculos veiculos) {
        Veiculos veiculo = veiculoRepository.findById(id).get();
        veiculo.setDescricao(veiculos.getDescricao());
        veiculo.setCategoria(veiculos.getCategoria());
        veiculo.setImagem(veiculos.getImagem());
        veiculo.setMarca(veiculos.getMarca());
        veiculo.setNome(veiculos.getNome());
    }
}
