package com.br.sion.repositorios;

import com.br.sion.modelo.Curso;
import com.br.sion.modelo.Disciplina;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class CursosRowMapper implements RowMapper<Curso> {

    @Override
    public Curso mapRow(ResultSet rs, int i) throws SQLException {
        Long curso_id = rs.getLong("curso_id");
        String curso_nome = rs.getString("curso_nome");
        int curso_periodo = rs.getInt("curso_periodo");
        Disciplina disciplina_id = Disciplina.valueOf(rs.getLong("disciplina_id"),rs.getString("disciplina_nome"));
        Disciplina disciplina_nome = null;
        
        return new Curso(curso_id, curso_nome, curso_periodo, disciplina_id, disciplina_nome);
    }
    
}
