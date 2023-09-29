package com.br.streaming.flix.Service;


import com.br.streaming.flix.Entity.Filme;
import com.br.streaming.flix.Repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;

    public List<Filme> listaTodos() {
        return repository.findAll();
    }

    public List<Filme> listaPorNome(String nome) {

        return repository.findByNomeContainsIgnoreCase(nome);
    }


    public Filme create(Filme filme) {
        return repository.save(filme);
    }

    public Filme update(Filme filme) {
        return repository.save(filme);
    }

    public List<Filme> findAll() {
        return repository.findAll();
    }

    public Optional<Filme> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}