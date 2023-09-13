package com.br.streaming.flix.Service;

import com.br.streaming.flix.Entity.Usuario;
import com.br.streaming.flix.Repository.UsuarioRepository;
import com.br.streaming.flix.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listaTodos(){
        return repository.findAll();
    }

    public List<Usuario> listaPorNome(String nome){

        return repository.findByNomeContainsIgnoreCase(nome);
    }

    public List<Usuario> listaPorNomeOrEmail(UsuarioDTO dto){
        return repository.findByNomeOrEmail(dto.getNome(), dto.getEmail());
    }
    @Transactional
    public void atualizaEmailUsario(String email, Long id){
        repository.atualizaEmailUsuario(email, id);
    }


}