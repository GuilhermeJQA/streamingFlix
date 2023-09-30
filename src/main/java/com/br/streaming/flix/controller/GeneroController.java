package com.br.streaming.flix.controller;

import com.br.streaming.flix.entity.Genero;
import com.br.streaming.flix.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/generos")
public class GeneroController {

    @Autowired
    GeneroService service;

    @GetMapping("/listar-todos")
    @ResponseStatus(HttpStatus.OK)
    public List<Genero> findAll() {
        return service.listaTodos();
    }

    @GetMapping("/listar-por-nome/{genero}")
    @ResponseStatus(HttpStatus.OK)
    public List<Genero> buscarNome(@PathVariable String genero) {
        return service.listaPorNome(genero);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Genero> create(@RequestBody Genero genero) {
        Genero generoCreated = service.create(genero);
        return ResponseEntity.status(201).body(generoCreated);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Genero> update(@RequestBody Genero genero) {
        Genero generoCreated = service.create(genero);
        return ResponseEntity.status(201).body(generoCreated);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Genero> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}