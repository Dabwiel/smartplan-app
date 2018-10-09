package br.com.gew.smartplan.model;

import java.io.Serializable;
import java.util.List;

public class Professor implements Serializable {

    private Long id;

    private String nome;

    private String username;

    private String senha;

    private static Professor instance;

    public static Professor getInstance() {
        if (instance == null) {
            instance = new Professor();
        }
        return instance;
    }

    public Long getId() {
        return this.id;
    }

    public void setId() {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

