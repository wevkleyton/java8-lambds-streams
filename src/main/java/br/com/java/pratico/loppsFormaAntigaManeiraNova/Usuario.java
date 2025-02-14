package br.com.java.pratico.loppsFormaAntigaManeiraNova;

public class Usuario {

    private String nome;
    private int pontos;
    private Boolean moderador;

    public Usuario(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
        this.moderador = false;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void tornarModerador(){
        this.moderador = true;
    }

    public boolean isModerador(){
        return moderador;
    }
}
