    package com.br.sion.repositorios;


import com.br.sion.modelo.Disciplina;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class DisciplinasRepository {

    @Autowired
    private JdbcTemplate template;
    
    public List<Disciplina> lista() {
        String sql = "select * from disciplinas";
        return template.query(sql, new DisciplinasRowMapper());
    }
    
    public Disciplina busca(Long disciplina_id) {
        String sql = "select * from disciplinas where disciplina_id = ?";
        Object[] parametros = { disciplina_id };
        return template.queryForObject(sql, parametros, new DisciplinasRowMapper());
    }
    
    public void salva(Disciplina disciplina) {
        String sql = 
                "insert into disciplinas (disciplina_id, disciplina_nome, curso_id, curso_nome, curso_periodo) " +
                "values (?, ?, ? , ?, ?)";
        Object[] parametros = {
            disciplina.getDisciplina_id(), disciplina.getDisciplina_nome(),
            disciplina.getCurso_id(),disciplina.getCurso_nome(),disciplina.getCurso_periodo()
        };
        template.update(sql, parametros);
    }
    
    public void atualiza(Long disciplina_id, Disciplina disciplina) {
        String sql = 
                "update disciplinas set disciplina_nome = ?, curso_id = ?, curso_nome = ?, curso_periodo = ?" +
                "where disciplina_id = ?";
        Object[] parametros = {
            disciplina.getDisciplina_nome(),
            disciplina.getCurso_id(),disciplina.getCurso_nome(),disciplina.getCurso_periodo(), disciplina_id
        };
        template.update(sql, parametros);
    }
    
    public void remove(Long disciplina_id) {
        String sql = "delete from discciplinas where disciplina_id = ?";
        Object[] parametros = { disciplina_id };
        template.update(sql, parametros);
    }
    
}
