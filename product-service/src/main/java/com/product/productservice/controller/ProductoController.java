package com.product.productservice.controller;

import com.product.productservice.model.Producto;
import com.product.productservice.service.ProductoList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/product")
public class ProductoController {

    @GetMapping("/listar")
    public ProductoList listar() {
        return new ProductoList(
                Arrays.asList(
                        new Producto(1L, "Leche", 20.05),
                        new Producto(2L, "Huevos", 5.20)
                )
        );
    }
}