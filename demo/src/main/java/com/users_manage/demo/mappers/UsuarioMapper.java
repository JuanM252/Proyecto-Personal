package com.users_manage.demo.mappers;

import org.springframework.stereotype.Component;

import com.users_manage.demo.dtos.UsuarioDto;
import com.users_manage.demo.models.UsuarioModel;

@Component

public class UsuarioMapper {


    public UsuarioModel toEntity(UsuarioDto dto) {
        UsuarioModel Umodel = new UsuarioModel();
        Umodel.setNom(dto.getNombre());
        Umodel.setEmail(dto.getCorreo());
        Umodel.setPassword(dto.getContraseña());
        return Umodel;
    }
}
