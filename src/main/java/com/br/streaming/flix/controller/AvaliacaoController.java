package com.br.streaming.flix.controller;

import com.br.streaming.flix.entity.Avaliacao;
import com.br.streaming.flix.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoController {

    @Autowired
    AvaliacaoService service;

    @GetMapping("/listar-todos")
    @ResponseStatus(HttpStatus.OK)
    public List<Avaliacao> findAll() {
        return service.listaTodos();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Avaliacao> create(@RequestBody Avaliacao avaliacao) {
        Avaliacao avaliacaoCreated = service.create(avaliacao);
        return ResponseEntity.status(201).body(avaliacaoCreated);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Avaliacao> update(@RequestBody Avaliacao avaliacao) {
        Avaliacao avaliacaoCreated = service.create(avaliacao);
        return ResponseEntity.status(201).body(avaliacaoCreated);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Avaliacao> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}