package com.br.streaming.flix.repository;

import com.br.streaming.flix.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

    List<Filme> findByNomeContainsIgnoreCase(String nome);

    @Query(value = "SELECT f.*, g.genero " +
            "FROM filme f " +
            "INNER JOIN genero fg ON f.id_filme = fg.id_filme " +
            "INNER JOIN genero g ON fg.id_genero = g.id_genero " +
            "WHERE f.id_filme = ?1", nativeQuery = true)
    public List<Filme> findByGeneroFilme(Long idFilme);

}
