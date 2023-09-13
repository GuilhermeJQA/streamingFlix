package com.br.streaming.flix.Repository;

import com.br.streaming.flix.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    List<Usuario> findByNomeContainsIgnoreCase(String nome);

    List<Usuario> findByNomeOrEmail(String nome, String curso);

    @Modifying
    @Query("update Usuario a set a.email = ?1 where a.id = ?2")
    void atualizaEmailUsuario(String email, Long id);




}