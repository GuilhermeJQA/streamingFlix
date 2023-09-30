package com.br.streaming.flix.repository;

import com.br.streaming.flix.entity.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {
    @Query
    List<Genero> findByGeneroContainsIgnoreCase(String genero);
}
