package com.persona.personaservice.service;

import com.persona.personaservice.entity.Persona;

import java.util.List;

public class PersonaList {

    private List<Persona> per;

    public PersonaList(List<Persona> per) {
        this.per = per;
    }

    public List<Persona> getPer() {
        return per;
    }

    public void setPer(List<Persona> per) {
        this.per = per;
    }
}