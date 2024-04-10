package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionUsuario;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {

    //en los servicios
    //debo inyectar las dependencias de
    //1. las validaciones
    //2. las consultas o repositorios
    @Autowired
    ValidacionUsuario validacionUsuario;
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    //en el servicio se crea un metodo
    //para cada una de las consultas a realizar en BD

    //guardar un usuario
    public Usuario guardarUsuario(){
        return null;
    }

    //consultar un usuario en bd por ID
    public Usuario buscarUsuarioPorId(){
        return null;
    }


    //consultar todos los usuarios
    public List<Usuario> buscarTodosUsuarios(){
        return null;
    }

    //editar un usuario
    public Usuario modificarUsuario(){
        return null;
    }

    //eliminar un usuario
    public boolean eliminarUsuario(){
        return true;
    }

}
