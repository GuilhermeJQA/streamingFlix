package com.br.streaming.flix.Service;

import com.br.streaming.flix.Entity.Avaliacao;
import com.br.streaming.flix.Repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository repository;

    public List<Avaliacao> listaTodos(){
        return repository.findAll();
    }

    public Avaliacao create(Avaliacao avaliacao) {
        return repository.save(avaliacao);
    }

    public Avaliacao update(Avaliacao avaliacao) {
        return repository.save(avaliacao);
    }

    public List<Avaliacao> findAll() {
        return repository.findAll();
    }

    public Optional<Avaliacao> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

