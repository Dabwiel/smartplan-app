package br.com.gew.smartplan.model;

import java.io.Serializable;
import java.util.List;

public class Professor implements Serializable{

    private Long id;

    private String nome;

    private String email;

    private String senha;

    private List<Turma> turmas;

    private List<Planejamento> planejamentos;

    private static Professor instance;

    public static Professor getInstance() {
        if(instance == null) {
            instance = new Professor();
        }
        return instance;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(){
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public List<Planejamento> getPlanejamentos() {
        return planejamentos;
    }

    public void setPlanejamentos(List<Planejamento> planejamentos) {
        this.planejamentos = planejamentos;
    }
}

