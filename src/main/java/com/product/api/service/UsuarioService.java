package com.product.api.service;

import com.product.api.entity.Usuario;

public interface UsuarioService {

    Usuario registrarEncriptado(Usuario usuario) throws Exception;
}
