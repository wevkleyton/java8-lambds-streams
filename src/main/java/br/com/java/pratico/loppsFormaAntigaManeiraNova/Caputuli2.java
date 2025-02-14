package br.com.java.pratico.loppsFormaAntigaManeiraNova;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Caputuli2 {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Paulo Silva", 150);
        Usuario usuario2 = new Usuario("Rodrigo Turini", 120);
        var     usuario3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

//        for(Usuario u: usuarios){
//            System.out.println(u.getNome());
//        }

//        usuarios.forEach(new Consumer<Usuario>() {
//            @Override
//            public void accept(Usuario usuario) {
//                System.out.println("#######");
//                System.out.println(usuario.getNome());
//            }
//        });


//        Consumer<Usuario> consumer = u -> System.out.println(u.getNome());
        usuarios.forEach(u-> System.out.println(u.getNome()));
        usuarios.forEach(u -> u.tornarModerador());
//        usuarios.forEach(u-> System.out.println(u.getNome()));
    }
}
