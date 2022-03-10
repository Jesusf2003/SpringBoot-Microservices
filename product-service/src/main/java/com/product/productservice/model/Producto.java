package com.product.productservice.model;

public class Producto {

    private Long codpre;
    private String nomprod;
    private Double priceprod;

    public Producto(Long codpre, String nomprod, Double priceprod) {
        this.codpre = codpre;
        this.nomprod = nomprod;
        this.priceprod = priceprod;
    }

    public Long getCodpre() {
        return codpre;
    }

    public void setCodpre(Long codpre) {
        this.codpre = codpre;
    }

    public String getNomprod() {
        return nomprod;
    }

    public void setNomprod(String nomprod) {
        this.nomprod = nomprod;
    }

    public Double getPriceprod() {
        return priceprod;
    }

    public void setPriceprod(Double priceprod) {
        this.priceprod = priceprod;
    }
}