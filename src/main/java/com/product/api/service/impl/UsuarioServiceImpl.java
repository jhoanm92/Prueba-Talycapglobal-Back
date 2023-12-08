package com.product.api.service.impl;

import com.product.api.entity.Usuario;
import com.product.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UsuarioServiceImpl {

    @Autowired
    private UsuarioRepository repositoryepository;

    @Autowired
    private BCryptPasswordEncoder bcrypt;

    public Usuario registrarEncriptado(Usuario usuario){
        usuario.setPassword(bcrypt.encode(usuario.getPassword()));
        return repositoryepository.save(usuario);
    }
}
