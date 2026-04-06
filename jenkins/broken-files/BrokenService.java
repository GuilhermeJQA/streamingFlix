package com.br.streaming.flix.service;

import org.springframework.stereotype.Service;

@Service
public class BrokenService {

    // ERRO INTENCIONAL: falta ponto e virgula
    public String getMessage() {
        String msg = "Hello"
        return msg;
    }
}
