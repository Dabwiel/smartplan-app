package br.com.gew.smartplan.model;

public class Aluno {

    private Long id;
    private String nome;
    private String obs;
    private String email;

    public Aluno(String nome, String obs, String email) {
        this.nome = nome;
        this.obs = obs;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}