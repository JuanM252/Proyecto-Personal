package com.users_manage.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.users_manage.demo.models.UsuarioModel;
import com.users_manage.demo.repositories.UsuarioRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class UsuarioService {


    private final UsuarioRepo usuarioRepo;


    public UsuarioModel crearUsuario(UsuarioModel usuariomodel) {
        return usuarioRepo.save(usuariomodel);
    }


    public List<UsuarioModel> listar()  {
        return usuarioRepo.findAll();
    }

}
