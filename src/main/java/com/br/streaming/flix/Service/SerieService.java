package com.br.streaming.flix.Service;

import com.br.streaming.flix.Entity.Serie;
import com.br.streaming.flix.Repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SerieService {

    @Autowired
    private SerieRepository repository;

    public List<Serie> listaTodos() {
        return repository.findAll();
    }

    public List<Serie> listaPorNome(String nome) {

        return repository.findByNomeContainsIgnoreCase(nome);
    }


    public Serie create(Serie serie) {
        return repository.save(serie);
    }

    public Serie update(Serie serie) {
        return repository.save(serie);
    }

    public List<Serie> findAll() {
        return repository.findAll();
    }

    public Optional<Serie> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}