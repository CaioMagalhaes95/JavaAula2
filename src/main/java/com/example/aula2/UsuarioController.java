package com.example.aula2;

import org.springframework.web.bind.annotation.RestController;

import com.example.aula2.models.Usuario;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class UsuarioController {
    
    private UserRepository userRepository;

    public UsuarioController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping(value="usuario")
    public Usuario inserir(@RequestBody Usuario usuario) {
        
        userRepository.inserir(usuario);
        
        return usuario;
    }
    

    @GetMapping(value="usuario")
    public List<Usuario> obterTodos(){
        return userRepository.obterTodos();
    }
    
    
}
