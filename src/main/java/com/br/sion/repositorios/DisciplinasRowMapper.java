package com.br.sion.repositorios;


import com.br.sion.modelo.Curso;
import com.br.sion.modelo.Disciplina;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class DisciplinasRowMapper implements RowMapper<Disciplina> {

    @Override
    public Disciplina mapRow(ResultSet rs, int i) throws SQLException {
        Long disciplina_id = rs.getLong("disciplina_id");
        String disciplina_nome = rs.getString("disciplina_nome");
        Long curso_id = rs.getLong("curso_id");
        String curso_nome = rs.getString("curso_nome"); 
        Curso curso_periodo = Curso.valueOf(rs.getInt("curso_periodo"));        
        
        return new Disciplina(disciplina_id, disciplina_nome, curso_id, curso_nome, curso_periodo);
    }
    
}
