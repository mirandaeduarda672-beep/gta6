package com.example.gta6.service;

import com.example.gta6.entity.Personagem;
import com.example.gta6.repository.PersonagemRepository;
import org.springframework.stereotype.Service;

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
}
