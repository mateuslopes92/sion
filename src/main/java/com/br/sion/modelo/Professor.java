/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.sion.modelo;

/**
 *
 * @author mateus
 */
public class Professor {
    
    private Long professor_cpf;
    private String professor_nome;
    private String professor_email;
    private String professor_endereco;
    private Long professor_telefone;
    
    public Professor(){}

    public Professor(Long professor_cpf, String professor_nome, String professor_email, String professor_endereco, Long professor_telefone) {
        this.professor_cpf = professor_cpf;
        this.professor_nome = professor_nome;
        this.professor_email = professor_email;
        this.professor_endereco = professor_endereco;
        this.professor_telefone = professor_telefone;
    }

    public Long getProfessor_cpf() {
        return professor_cpf;
    }

    public void setProfessor_cpf(Long professor_cpf) {
        this.professor_cpf = professor_cpf;
    }

    public String getProfessor_nome() {
        return professor_nome;
    }

    public void setProfessor_nome(String professor_nome) {
        this.professor_nome = professor_nome;
    }

    public String getProfessor_email() {
        return professor_email;
    }

    public void setProfessor_email(String professor_email) {
        this.professor_email = professor_email;
    }

    public String getProfessor_endereco() {
        return professor_endereco;
    }

    public void setProfessor_endereco(String professor_endereco) {
        this.professor_endereco = professor_endereco;
    }

    public Long getProfessor_telefone() {
        return professor_telefone;
    }

    public void setProfessor_telefone(Long professor_telefone) {
        this.professor_telefone = professor_telefone;
    }
    
    
}
