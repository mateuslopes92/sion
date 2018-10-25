/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.sion.repositorios;

import com.br.sion.modelo.Professor;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author mateus
 */
public class ProfessorRowMapper implements RowMapper<Professor> {
    
    @Override
    public Professor mapRow(ResultSet rs, int i) throws SQLException{
        Long professor_cpf = rs.getLong("professor_cpf");
        String professor_nome = rs.getString("professor_nome");
        String professor_email = rs.getString("professor_email");
        String professor_endereco = rs.getString("professor_endereco");
        Long professor_telefone = rs.getLong("professor_telefone");
        
        return new Professor(professor_cpf,professor_nome,professor_email,professor_endereco,professor_telefone);
        
    }
    
}
