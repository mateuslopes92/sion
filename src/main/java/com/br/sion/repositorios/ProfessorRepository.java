/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.sion.repositorios;

import com.br.sion.modelo.Professor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author mateus
 */
@Component
public class ProfessorRepository {
    
    @Autowired
    private JdbcTemplate template;
    
    public List<Professor> lista(){    
        String sql = "select *from professores";
        return template.query(sql,new ProfessorRowMapper());
    }
    
    public Professor busca(Long professor_cpf){
        String sql = "select * from professores where professor_cpf = ?";
        Object[] parametros = { professor_cpf };
        return template.queryForObject(sql, parametros, new ProfessorRowMapper());
    }
    
    public void salva(Professor professor){
        String sql = 
                "insert into professores (professor_cpf, professor_nome, professor_email, professor_endereco, professor_telefone)" +
                "values (?,?,?,?,?)";
        Object[] parametros = {
            professor.getProfessor_cpf(), professor.getProfessor_nome(), professor.getProfessor_email(),
            professor.getProfessor_endereco(), professor.getProfessor_telefone()
        };
    template.update(sql, parametros);
    }
    
    public void atualiza(Long professor_cpf, Professor professor){
        String sql = 
                "update professores set professor_nome = ?, professor_email = ?,professor_endereco = ?, professor_telefone = ? " + 
                "where professor_cpf = ?";
        Object[] parametros = {
            professor.getProfessor_nome(), professor.getProfessor_email(), professor.getProfessor_endereco(),
            professor.getProfessor_telefone(), professor_cpf
        };
        template.update(sql, parametros);
        }
    
    public void remove(Long professor_cpf){
        String sql = "delete from professores where professor_cpf = ?";
        Object[] parametros = {professor_cpf};
        template.update(sql, parametros);
    }
}

    
   
