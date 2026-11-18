package com.example.gta6.controller;

import com.example.gta6.entity.Arma;
import com.example.gta6.service.ArmaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/armas")
public class ArmaController {

    ArmaService armaService;

    public ArmaController(ArmaService armaService){
        this.armaService = armaService;
    }

    @PostMapping
    public void inserirArma(@RequestBody Arma arma){
        armaService.criarArma(arma);
    }
    @GetMapping
    public List<Arma> listarArmas(){
       return armaService.acharArma();
    }
    @DeleteMapping("/{id}")
    public void deletarArma(@PathVariable long id){
        armaService.excluirArma(id);
    }
    @PutMapping
    public void atualizarArma(long id,Arma arma){
        armaService.editarArma(id, arma);
    }
}
