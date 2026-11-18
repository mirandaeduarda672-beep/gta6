package com.example.gta6.controller;

import com.example.gta6.entity.Veiculos;
import com.example.gta6.service.VeiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/veiculos")
public class VeiculoController {
    VeiculoService veiculoService;
    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }
    @PostMapping
    public void criarVeiculo(@RequestBody Veiculos v){
        veiculoService.criarVeiculo(v);
    }
    @GetMapping
    public List<Veiculos> listarVeiculos(){
        return veiculoService.acharVeiculos();
    }
    @PutMapping("/{id}")
    public void atualizarVeiculo(@PathVariable long id, @RequestBody Veiculos veiculo){
        veiculoService.editarVeiculo(id, veiculo);
    }
    @DeleteMapping("/{id}")
    public void deletarVeiculo(@PathVariable long id){
        veiculoService.excluirVeiculo(id);
    }
}
