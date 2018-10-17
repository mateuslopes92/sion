package com.br.sion.repositorios;

import com.br.sion.modelo.Aluno;
import com.br.sion.modelo.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class CursosRepository {

    @Autowired
    private JdbcTemplate template;
    
    public List<Curso> lista() {
        String sql = "select * from cursos";
        return template.query(sql, new CursosRowMapper());
    }
    
    public Curso busca(Long curso_id) {
        String sql = "select * from cursos where curso_id = ?";
        Object[] parametros = { curso_id };
        return template.queryForObject(sql, parametros, new CursosRowMapper());
    }
    
    public void salva(Curso curso) {
        String sql = 
                "insert into cursos (curso_id, curso_nome, curso_periodo, disciplina_id, disciplina_nome) " +
                "values (?, ?, ?, ?, ?)";
        Object[] parametros = {
            curso.getCurso_id(), curso.getCurso_nome(),
            curso.getCurso_periodo(), curso.getDisciplina_id(),curso.getDisciplina_nome()
        };
        template.update(sql, parametros);
    }
    
    public void atualiza(Long curso_id, Curso curso) {
        String sql = 
                "update cursos set curso_nome = ?, curso_periodo = ?, disciplina_id = ?,disciplina_nome = ?" +
                "where curso_id = ?";
        Object[] parametros = {
            curso.getCurso_nome(),
            curso.getCurso_periodo(), curso.getDisciplina_id(),curso.getDisciplina_nome(),curso_id
        };
        template.update(sql, parametros);
    }
    
    public void remove(Long curso_id) {
        String sql = "delete from cursos where curso_id = ?";
        Object[] parametros = { curso_id };
        template.update(sql, parametros);
    }
    
}
