package com.persona.personaservice.entity;

import javax.persistence.*;

public class Persona {

    private Long codper;

    private String nomper;

    private String lnameper;

    public Persona(Long codper, String nomper, String lnameper) {
        this.codper = codper;
        this.nomper = nomper;
        this.lnameper = lnameper;
    }

    public Long getCodper() {
        return codper;
    }

    public void setCodper(Long codper) {
        this.codper = codper;
    }

    public String getNomper() {
        return nomper;
    }

    public void setNomper(String nomper) {
        this.nomper = nomper;
    }

    public String getLnameper() {
        return lnameper;
    }

    public void setLnameper(String lnameper) {
        this.lnameper = lnameper;
    }
}