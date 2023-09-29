package com.br.streaming.flix.Entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Avaliacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "ds_avaliacao", length = 1000)
    private String avaliacao;



    @ManyToOne
    @JoinColumn(name= "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_filme")
    private Filme filme;

    @ManyToOne
    @JoinColumn(name = "id_serie")
    private Serie serie;

}
