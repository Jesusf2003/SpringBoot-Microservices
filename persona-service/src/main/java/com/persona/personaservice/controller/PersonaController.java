package com.persona.personaservice.controller;

import com.persona.personaservice.entity.Persona;
import com.persona.personaservice.service.PersonaList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RequestMapping("/persona")
@RestController
public class PersonaController {

    @GetMapping("/")
    public PersonaList listar() {
        return new PersonaList(
                Arrays.asList(
                        new Persona(1L, "Fernando", "Canales")
                )
        );
    }
}