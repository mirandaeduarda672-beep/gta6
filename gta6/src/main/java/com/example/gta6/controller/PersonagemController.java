    package com.example.gta6.controller;

    import com.example.gta6.entity.Personagem;
    import com.example.gta6.service.PersonagemService;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("api/personagens")
    public class PersonagemController {
        PersonagemService personagemService;
        public PersonagemController(PersonagemService personagemService) {   this.personagemService = personagemService;}
        @PostMapping
        public void novoPersonagem(@RequestBody Personagem personagem) {
             personagemService.criarPersonagem(personagem);
        }

        @GetMapping
        public List<Personagem> listarProfessores(){
            return personagemService.acharPersonagem();
        }

        @DeleteMapping("/{id}")
        public void deletarPersonagem(@PathVariable long id){
            personagemService.deletarPersonagem(id);
        }

        @PutMapping("/{id}")
        public void atualizarPersonagem(@PathVariable long id, @RequestBody Personagem personagem){
            personagemService.alterar(id, personagem);
        }
    }
