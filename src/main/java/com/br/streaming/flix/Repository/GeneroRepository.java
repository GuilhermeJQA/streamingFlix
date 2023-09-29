package com.br.streaming.flix.Repository;

import com.br.streaming.flix.Entity.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {
    List<Genero> findByGeneroContainsIgnoreCase(String genero);
}
