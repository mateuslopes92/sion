package com.br.sion.repositorios;

import com.br.sion.modelo.Aluno;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class AlunosRowMapper implements RowMapper<Aluno> {

    @Override
    public Aluno mapRow(ResultSet rs, int i) throws SQLException {
        Long ra = rs.getLong("ra");
        String nome = rs.getString("nome");
        Boolean monitor = rs.getBoolean("monitor");
        int periodo = rs.getInt("periodo");
        
        return new Aluno(ra, nome, monitor, periodo);
    }
    
}
