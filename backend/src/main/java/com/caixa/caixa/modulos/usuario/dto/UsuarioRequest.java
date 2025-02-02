package com.caixa.caixa.modulos.usuario.dto;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioRequest {

    private UUID id;
    private String usuario;
    private String nome;
    private String senha;

}
