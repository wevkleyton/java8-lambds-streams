package br.com.java.pratico.loppsFormaAntigaManeiraNova;

@FunctionalInterface
public interface Validador <T>{
    boolean valida (T t);
}
