package com.product.productservice.service;

import com.product.productservice.model.Producto;

import java.util.List;

public class ProductoList {

    private List<Producto> prod;

    public ProductoList(List<Producto> prod) {
        this.prod = prod;
    }

    public List<Producto> getProd() {
        return prod;
    }

    public void setProd(List<Producto> prod) {
        this.prod = prod;
    }
}