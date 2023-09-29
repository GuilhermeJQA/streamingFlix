package com.br.streaming.flix.Repository;

import com.br.streaming.flix.Entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {
    List<Filme> findByNomeContainsIgnoreCase(String nome);
}
