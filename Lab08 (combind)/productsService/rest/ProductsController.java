package com.example.ProductsServoce.rest;


import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private final Environment env;

    public ProductsController(Environment env) {
        this.env = env;
    }

    @PostMapping
    public String createProduct() {
        return "HTTP POST handled";
    }
    @GetMapping
    public String getProduct() {
        return "HTTP GET Handled " + env.getProperty("local.server.port");
    }
    @PutMapping
    public String updateProduct() {
        return "HTTP PUT Handled";
    }
    @DeleteMapping
    public String deleteProduct() {
        return "HTTP DELETE Handled";
    }
}
