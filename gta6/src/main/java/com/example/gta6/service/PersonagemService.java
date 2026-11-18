package com.example.gta6.service;

import com.example.gta6.entity.Personagem;
import com.example.gta6.repository.PersonagemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonagemService {
    PersonagemRepository personagemRepository;
    public PersonagemService(PersonagemRepository personagemRepository) {this.personagemRepository = personagemRepository;}

    public List<Personagem> acharPersonagem() {
            return personagemRepository.findAll();
    }

    public void criarPersonagem(Personagem personagem) {
        Personagem save = personagemRepository.save(personagem);
        personagemRepository.save(save);
    }

    public void deletarPersonagem(Long id ) {
        personagemRepository.deleteById(id);
    }
    @Transactional
    public void alterar(long id, Personagem personagem) {
        Personagem p = personagemRepository.getReferenceById(id);
        p.setNome(personagem.getNome());
        p.setApelido(personagem.getApelido());
        p.setDescricao(personagem.getDescricao());
        p.setImagem(personagem.getImagem());
        p.setCategoria(personagem.getCategoria());
    }
}
