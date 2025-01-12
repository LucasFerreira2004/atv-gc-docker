package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/api")
public class Controller {
    @Autowired
    ProdutoService produtoService;
    @GetMapping
    public List<Produto> getAll(){
        return produtoService.findAll();
    }

    @PostMapping
    public Produto post(@RequestBody  Produto produto){
        return produtoService.save(produto);
    }

}
