package com.br.streaming.flix.repository;


import com.br.streaming.flix.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    List<Usuario> findByNomeContainsIgnoreCase(String nome);
    @Query(value = "SELECT u FROM Usuario u " +
            "WHERE u.email IS NOT NULL")
    public List<Usuario> findByEmail();

}