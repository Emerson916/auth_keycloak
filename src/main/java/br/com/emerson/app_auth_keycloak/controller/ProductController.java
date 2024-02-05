package br.com.emerson.app_auth_keycloak.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/products")

public class ProductController {
    @GetMapping("/")
    @PreAuthorize("hasRole('EMPLOYEE')")
    public String List() {
        return "Listando Produtos";
    }
    
    @PostMapping("/")
    @PreAuthorize("hasRole('ADMIN')")
    public String create() {
        return "Cadastrando produtos";
    }
}
