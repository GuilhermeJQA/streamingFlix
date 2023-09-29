package com.br.streaming.flix.Repository;

import com.br.streaming.flix.Entity.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {
    List<Serie> findByNomeContainsIgnoreCase(String nome);
}
