package com.users_manage.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "users")
@Data

public class UsuarioModel {

    @Id
    private String id;

    
    private String nom;
    private String email;
    private String password;
    public void setCorreo(String correo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCorreo'");
    }
    public void setContraseña(String contraseña) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setContraseña'");
    }

}
